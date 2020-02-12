/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObjects;

import Game.GamePanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Rectangle;

/**
 *
 * @author cocor
 */
public class PowerUp extends MovingGameObject
{
    public char symbol;

    public PowerUp(char symbol, int xPos, int yPos, int xVel, int yVel, Color c)
    {
        super(xPos, yPos, xVel, yVel, c);
        this.symbol = symbol;
       
    }
    
    public PowerUp(int xPos, int yPos, char sym, Color c)
    {
        super(xPos, yPos, 0, 2, c);
        symbol = sym;

    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(color);
        
        if(this.symbol == 'L')
        {
            Polygon heart = new Polygon();
            heart.addPoint(xPosition + 3,yPosition);
            heart.addPoint(xPosition + 6, yPosition + 3);
            heart.addPoint(xPosition + 9, yPosition);
            heart.addPoint(xPosition + 12, yPosition + 3);
            heart.addPoint(xPosition + 12, yPosition + 6);
            heart.addPoint(xPosition + 6, yPosition + 12);
            heart.addPoint(xPosition, yPosition + 6);
            heart.addPoint(xPosition, yPosition + 3);
            
            g.fillPolygon(heart);
            g.setColor(Color.WHITE);
            g.drawPolygon(heart);
        }
        if(this.symbol == 'W')
        {
            Polygon plus = new Polygon();
            plus.addPoint(xPosition + 4, yPosition);
            plus.addPoint(xPosition + 8, yPosition);
            plus.addPoint(xPosition + 8, yPosition + 4);
            plus.addPoint(xPosition + 12, yPosition + 4);
            plus.addPoint(xPosition + 12, yPosition + 8);
            plus.addPoint(xPosition + 8, yPosition + 8);
            plus.addPoint(xPosition + 8, yPosition + 12);
            plus.addPoint(xPosition + 4, yPosition + 12);
            plus.addPoint(xPosition + 4, yPosition + 8);
            plus.addPoint(xPosition, yPosition + 8);
            plus.addPoint(xPosition, yPosition + 4);
            plus.addPoint(xPosition + 4, yPosition + 4);
            
            g.fillPolygon(plus);
            g.setColor(Color.WHITE);
            g.drawPolygon(plus);
        }
    }

    @Override
    public Rectangle getBounds()
    {
        Rectangle rect = new Rectangle(xPosition, yPosition, 12, 12);
        return rect;
    }

    @Override
    public void move()
    {
        super.move();
    }
    
    public void onCollection(Ball ball, Paddle paddle)
    {
        if(this.symbol == 'L')
        {
            ball.addLives(+1);
        }
        if(this.symbol == 'W')
        {
            paddle.width *= 2;
            paddle.speed += 4;
        }
    }
    
    
    
    
    
    
}
