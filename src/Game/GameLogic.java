/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import GameObjects.Ball;
import GameObjects.Brick;
import GameObjects.GameObject;
import GameObjects.Obstacle;
import GameObjects.Paddle;
import GameObjects.PowerUp;
import java.util.Random;

/**
 *
 * @author cocor
 */
public class GameLogic
{
    static Random rand = new Random();
    public static void checkCollisions(Ball ball, Paddle paddle, Obstacle obstacle)
    {
        //checks collisions for balls with walls
        if(ball.getBounds().x <= 0 || ball.getBounds().x + ball.getBounds().width >= 600)
        {
            ball.setXVelocity(-1 * ball.getXVelocity());
        }
        if(ball.getBounds().y <= 0)
        {
            ball.setYVelocity(-1 * ball.getYVelocity());
        }
        
        //checks collisions for balls with paddles
        if(ball.isColliding(paddle))
        {   
            int rate = ball.getPosition() - paddle.getPosition();
            
            ball.setYVelocity(-1 * ball.getYVelocity());
            ball.setXVelocity(rate/4);
        }
        //checks collisions for the ball with obstacle
        if(ball.isColliding(obstacle))
        {
            int rate = ball.getPosition() - obstacle.getPosition();
            
            ball.setYVelocity(-1 * ball.getYVelocity());
            ball.setXVelocity(rate/6);
        }
    }

    public static void polyCollision(Ball ball, GameObject object, PowerUp power, PowerUp power2)
    {
        //use polymorphism to check all instances of bricks.
        if(ball.isColliding(object))
        {
            //if it hits a brick, it bounces off and destroys it.
            if(object instanceof Brick)
            {
                if(ball.getPosition() < object.getBounds().x || ball.getPosition() > object.getBounds().x + object.getBounds().width)
                {
                    ball.setXVelocity((-1 * ball.getXVelocity()));
                }
                else
                {
                    ball.setYVelocity(-1 * ball.getYVelocity());
                }
                //shrinks and moves the brick appropriately
                ((Brick) object).setWidth(((Brick) object).getWidth() - 15);
                ((Brick) object).setHeight(((Brick) object).getHeight() - 10);
                //if the brick is gone shrinks to nothing, do this
                if(((Brick) object).width <= 0)
                {
                    //spawns powerups
                    int random = rand.nextInt(4)+1;
                    if(random == 1)
                    {
                        power.setXPosition(((Brick) object).getPosition() - 6);
                        power.setYPosition(((Brick) object).yPosition + (((Brick) object).height/2));
                    }
                    if(random == 2)
                    {
                        power2.setXPosition(((Brick) object).getPosition() - 6);
                        power2.setYPosition(((Brick) object).yPosition + (((Brick) object).height/2));
                    }
                    object.setXPosition(-3);
                    ball.score += 10;
                    ball.destroyCount += 1;
                }
                else
                {
                    object.setXPosition(object.getXPosition() + 7);
                    object.setYPosition(object.getYPosition() + 5);
                }
            }
            
            if(object instanceof Obstacle)
            {
                if(ball.getBounds().x < object.getBounds().x || ball.getBounds().x + ball.getBounds().width > object.getBounds().x + object.getBounds().width)
                {
                    ball.setXVelocity((-1 * ball.getXVelocity()));
                }
                else
                {
                    ball.setYVelocity(-1 * ball.getYVelocity());
                }
            }
        }    
    }
    
    private static boolean pCheckBallOnScreen(Ball ball)
    {
        boolean value = true;
        if(ball.getYPosition() >= 750)
        {
            value = false;
        }
        return value;
    }
    
    public static void checkBallOnScreen(Ball ball, Paddle paddle, Obstacle obstacle)
    {
        //if the ball isnt on the screen, do this
        if(pCheckBallOnScreen(ball) == false)
        {
            obstacle.setXPosition(265);
            ball.setXPosition(296);
            ball.setYPosition(600);
            ball.setXVelocity(rand.nextInt(8) - 4);
            ball.setYVelocity(-5);
            paddle.setXPosition(270);
            ball.addLives(-1);
            paddle.setWidth(60);
        }
        //probably should have been put in it's own method... too late now
        //please dont fail me
        //this part of the method checks if you ran out of lives or if you have won
        if(ball.lives < 0 || checkIfWon(ball))
        {
            obstacle.setSpeed(0);
            ball.setYVelocity(0);
            ball.setXVelocity(0);
            paddle.setSpeed(0);
            if(paddle.spaceBarPressed())
            {
                ball.destroyCount = 0;
                ball.lives = 2;
                ball.score = 301;
                ball.frameNumber = 0;
                ball.setXVelocity(rand.nextInt(8) - 4);
                ball.setYVelocity(-5);
                GamePanel.setupGame();
            }
        }
    }
    
    public static void checkObstacle(Obstacle obstacle)
    {
        if(obstacle.getBounds().x <= 0 || obstacle.getBounds().x + obstacle.getBounds().width >= 600)
        {
            obstacle.setSpeed(-1 * obstacle.getSpeed());
        }
    }
    
    public static void updateScore(Ball ball)
    {
        //score updates if you have lives
        if(ball.lives >= 0)
        {
            if(ball.frameNumber % 60 == 0)
            {
                ball.score -= 1;
            }
        }
    }
    
    public static boolean checkIfWon(Ball ball)
    {
        boolean val = false;
        //set value to the amount of bricks that you have
        if(ball.destroyCount == 27)
        {
            val = true;
        }
        return val;
    }
    
    public static void checkPowerUp(PowerUp power, Paddle paddle, Ball ball)
    {
        if(paddle.isColliding(power))
        {
            power.onCollection(ball, paddle);
            power.setXPosition(-20);
        }
    }
}
