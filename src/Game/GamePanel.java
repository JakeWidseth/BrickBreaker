/*
 * To change this license header, choose License Headers in Project Properties
 * To change this template file, choose Tools | Templates
 * and open the template in the editor
 */
package Game;

import Controller.KeyboardController;
import GameObjects.Ball;
import GameObjects.Brick;
import GameObjects.GameObject;
import GameObjects.Obstacle;
import GameObjects.Paddle;
import GameObjects.PowerUp;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author araderma
 */
public class GamePanel extends JPanel
{
    // These are for handling the frame rate of the game and player controls
    // You should pass the controller to any objects you create that will
    //  be under keyboard control
    private Timer gameTimer; 
    private static KeyboardController controller; 
    
    // Controls size of game window and framerate
    // You can adjust these if you want to use different values 
    private final int gameWidth = 600; 
    private final int gameHeight = 720; 
    private final int framesPerSecond = 60; 
        
    static Paddle paddle;
    static GameObject object;
    //couldn't figure out how to put them into an array and get stuff to still work efficiently...
    static Brick brick1;
    static Brick brick2;
    static Brick brick3;
    static Brick brick4;
    static Brick brick5;
    static Brick brick6;
    static Brick brick7;
    static Brick brick8;
    static Brick brick9;
    static Brick brick10;
    static Brick brick11;
    static Brick brick12;
    static Brick brick13;
    static Brick brick14;
    static Brick brick15;
    static Brick brick16;
    static Brick brick17;
    static Brick brick18;
    static Brick brick19;
    static Brick brick20;
    static Brick brick21;
    static Brick brick22;
    static Brick brick23;
    static Brick brick24;
    static Brick brick25;
    static Brick brick26;
    static Brick brick27;

    static PowerUp pUp;
    static PowerUp pUp2;
    static Obstacle obstacle;
    static Ball ball;
    
    
    /**
     * This method is called by the GameFrame class when starting the game for 
     *  the first time. It should be used like a constructor method where you
     *  initialize all of the instance variables. 
     * You can also use this method to reset a game after a player wins or loses
     *  and wants to play again. 
     */
    public static final void setupGame()
    {
        paddle = new Paddle(270, 690, 60, 10, 7, Color.WHITE, controller);
        ball = new Ball(296, 600, 12, Color.blue, 2);
        
        brick1 = new Brick(100, 100, 30, 20, Color.GREEN);
        brick2 = new Brick(150, 100, 30, 20, Color.GREEN);
        brick3 = new Brick(200, 100, 30, 20, Color.GREEN);
        brick4 = new Brick(250, 100, 30, 20, Color.GREEN);
        brick5 = new Brick(300, 100, 30, 20, Color.GREEN);
        brick6 = new Brick(350, 100, 30, 20, Color.GREEN);
        brick7 = new Brick(400, 100, 30, 20, Color.GREEN);
        brick8 = new Brick(450, 100, 30, 20, Color.GREEN);
        brick9 = new Brick(500, 100, 30, 20, Color.GREEN);
        brick10 = new Brick(100, 140, 30, 20, Color.red);
        brick11 = new Brick(150, 140, 30, 20, Color.red);
        brick12 = new Brick(200, 140, 30, 20, Color.red);
        brick13 = new Brick(250, 140, 30, 20, Color.red);
        brick14 = new Brick(300, 140, 30, 20, Color.red);
        brick15 = new Brick(350, 140, 30, 20, Color.red);
        brick16 = new Brick(400, 140, 30, 20, Color.red);
        brick17 = new Brick(450, 140, 30, 20, Color.red);
        brick18 = new Brick(500, 140, 30, 20, Color.red);
        brick19 = new Brick(100, 180, 30, 20, Color.cyan);
        brick20 = new Brick(150, 180, 30, 20, Color.cyan);
        brick21 = new Brick(200, 180, 30, 20, Color.cyan);
        brick22 = new Brick(250, 180, 30, 20, Color.cyan);
        brick23 = new Brick(300, 180, 30, 20, Color.cyan);
        brick24 = new Brick(350, 180, 30, 20, Color.cyan);
        brick25 = new Brick(400, 180, 30, 20, Color.cyan);
        brick26 = new Brick(450, 180, 30, 20, Color.cyan);
        brick27 = new Brick(500, 180, 30, 20, Color.cyan);
        
        
        obstacle = new Obstacle(255, 475, 90, 10, Color.RED, 4);
        pUp = new PowerUp('L', -20, 0, 0, 8, Color.RED);
        pUp2 = new PowerUp('W', -20, 0, 0, 8, Color.WHITE);
        
        
    }
    
    /**
     * This method is automatically called by the game timer every frame. As typical,
     *  you should use it to draw all of your game objects.
     * 
     * @param g The Graphics object used for drawing the GameObject instances.
     */
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        brick1.draw(g);
        brick2.draw(g);
        brick3.draw(g);
        brick4.draw(g);
        brick5.draw(g);
        brick6.draw(g);
        brick7.draw(g);
        brick8.draw(g);
        brick9.draw(g);
        brick10.draw(g);
        brick11.draw(g);
        brick12.draw(g);
        brick13.draw(g);
        brick14.draw(g);
        brick15.draw(g);
        brick16.draw(g);
        brick17.draw(g);
        brick18.draw(g);
        brick19.draw(g);
        brick20.draw(g);
        brick21.draw(g);
        brick22.draw(g);
        brick23.draw(g);
        brick24.draw(g);
        brick25.draw(g);
        brick26.draw(g);
        brick27.draw(g);
        paddle.draw(g);
        ball.draw(g);
        obstacle.draw(g);
        pUp.draw(g);
        pUp2.draw(g);
    }
    
    /**
     * This method is automatically called by the game timer every frame. Any of your
     *  code for moving game objects or handling collisions, etc. should be done 
     *  by this method. 
     * The method has a single parameter which represents the 
     *  current frame number, which is incremented by the Timer each time before 
     *  the method is called. You can assume that it will always increase, but it
     *  will eventually overflow if the game runs long enough (something like 1 year)
     * 
     * @param frameNumber The number of the current frame.
     */
    public void updateGameState(int frameNumber)
    {
        paddle.move();
        ball.move();
        obstacle.move();
        pUp.move();
        pUp2.move();
        
        GameLogic.checkCollisions(ball, paddle, obstacle);
        GameLogic.polyCollision(ball, brick1, pUp, pUp2);
        GameLogic.polyCollision(ball, brick2, pUp, pUp2);
        GameLogic.polyCollision(ball, brick3, pUp, pUp2);
        GameLogic.polyCollision(ball, brick4, pUp, pUp2);
        GameLogic.polyCollision(ball, brick5, pUp, pUp2);
        GameLogic.polyCollision(ball, brick6, pUp, pUp2);
        GameLogic.polyCollision(ball, brick7, pUp, pUp2);
        GameLogic.polyCollision(ball, brick8, pUp, pUp2);
        GameLogic.polyCollision(ball, brick9, pUp, pUp2);
        GameLogic.polyCollision(ball, brick10, pUp, pUp2);
        GameLogic.polyCollision(ball, brick11, pUp, pUp2);
        GameLogic.polyCollision(ball, brick12, pUp, pUp2);
        GameLogic.polyCollision(ball, brick13, pUp, pUp2);
        GameLogic.polyCollision(ball, brick14, pUp, pUp2);
        GameLogic.polyCollision(ball, brick15, pUp, pUp2);
        GameLogic.polyCollision(ball, brick16, pUp, pUp2);
        GameLogic.polyCollision(ball, brick17, pUp, pUp2);
        GameLogic.polyCollision(ball, brick18, pUp, pUp2);
        GameLogic.polyCollision(ball, brick19, pUp, pUp2);
        GameLogic.polyCollision(ball, brick20, pUp, pUp2);
        GameLogic.polyCollision(ball, brick21, pUp, pUp2);
        GameLogic.polyCollision(ball, brick22, pUp, pUp2);
        GameLogic.polyCollision(ball, brick23, pUp, pUp2);
        GameLogic.polyCollision(ball, brick24, pUp, pUp2);
        GameLogic.polyCollision(ball, brick25, pUp, pUp2);
        GameLogic.polyCollision(ball, brick26, pUp, pUp2);
        GameLogic.polyCollision(ball, brick27, pUp, pUp2);
        GameLogic.checkBallOnScreen(ball, paddle, obstacle);
        GameLogic.checkObstacle(obstacle);
        GameLogic.updateScore(ball);
        GameLogic.checkPowerUp(pUp, paddle, ball);
        GameLogic.checkPowerUp(pUp2, paddle, ball);
    }
    
   
    /**
     * Constructor method for GamePanel class.
     * It is not necessary for you to modify this code at all
     */
    public GamePanel()
    {
        // Set the size of the Panel
        this.setSize(gameWidth, gameHeight);
        this.setPreferredSize(new Dimension(gameWidth, gameHeight));
        
        this.setBackground(Color.BLACK);
        
        // Register KeyboardController as KeyListener
        controller = new KeyboardController(); 
        this.addKeyListener(controller); 
        
        // Call setupGame to initialize fields
        this.setupGame(); 
        
        this.setFocusable(true);
        this.requestFocusInWindow();
    }
    
    /**
     * Method to start the Timer that drives the animation for the game.
     * It is not necessary for you to modify this code unless you need to in 
     *  order to add some functionality. 
     */
    
    public void start()
    {
        // Set up a new Timer to repeat every 20 milliseconds (50 FPS)
        gameTimer = new Timer(1000 / framesPerSecond, new ActionListener() {

            // Tracks the number of frames that have been produced.
            // May be useful for limiting action rates
            
                        
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                // Update the game's state and repaint the screen
                if(obstacle.getSpeed() != 0)
                {
                    ball.frameNumber += 1;
                }
                updateGameState(ball.frameNumber);
                repaint();  
            }
        });
        
        gameTimer.setRepeats(true);
        gameTimer.start();
    }
}
