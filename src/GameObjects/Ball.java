/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObjects;

import Game.GameLogic;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author cocor
 */
public class Ball extends MovingGameObject
{
    public int diameter;
    Random rand = new Random();
    public int lives;
    public int frameNumber = 0;
    public int score;
    Font myfont = new Font(Font.SERIF, Font.BOLD, 30);
    public int destroyCount;
    
    public Ball(int xPos, int yPos, int d, Color c)
    {
        super(xPos, yPos, 0, -5, c);
        diameter = d;
        int xVel = rand.nextInt(8) - 4;
        super.setXVelocity(xVel);
    }
    
    public Ball(int xPos, int yPos, int d, Color c, int l)
    {
        super(xPos, yPos, 0, -5, c);
        diameter = d;
        int xVel = rand.nextInt(8) - 4;
        super.setXVelocity(xVel);
        lives = l;
        score = 300;
        destroyCount = 0;
    }
            
    
    public int getDiameter()
    {
        return diameter;
    }
    
    public int getPosition()
    {
        int value = this.xPosition + (this.diameter/2);
        return value;
    }
    
    public void addLives(int l)
    {
        lives += l;
    }
    
    public int getLives()
    {
        return lives;
    }

    public void draw(Graphics g)
    {
        if(this.lives >= 0)
        {
            g.setColor(color);
            g.fillOval(xPosition, yPosition, diameter, diameter);
            g.setColor(Color.WHITE);
            g.drawOval(xPosition, yPosition, diameter, diameter);
            g.drawString("Lives: " + this.lives, 300, 50);
            g.drawString("Score: " + this.score, 450, 50);
        }
        else if(this.lives < 0)
        {
            g.setFont(myfont);
            g.setColor(Color.white);
            g.drawString("u lose nerd", 235, 360);
            g.drawString("Press spacebar to play again", 125, 390);
        }
        if(GameLogic.checkIfWon(this))
        {
            int thisScore = this.getScore();
            g.setFont(myfont);
            g.setColor(Color.WHITE);
            g.drawString("u won", 260, 360);
            g.drawString("Score: " + thisScore, 230, 390);
            g.drawString("Press spacebar to play again", 125, 420);
        }
        
    }
    

    @Override
    public void move()
    {
        super.move();
    }

    @Override
    public Rectangle getBounds()
    {
        Rectangle bounds = new Rectangle(xPosition, yPosition, diameter, diameter);
        return bounds;
    }
    
    public int getFrame()
    {
        return frameNumber;
    }
    
    public void addFrame()
    {
        frameNumber += 1;
    }
    
    public int getScore()
    {
        return score;
    }
}
