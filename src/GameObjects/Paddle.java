/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObjects;

import Controller.KeyboardController;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author cocor
 */
public class Paddle extends ControlledGameObject
{
    public int width;
    public int height;
    public int speed;
    
    public Paddle(int xPos, int yPos, int w, int h, int s, Color c, KeyboardController con)
    {
        super(xPos, yPos, c, con);
        width = w;
        height = h;
        speed = s;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    public void setWidth(int w)
    {
        width = w;
    }
    
    public void setHeight(int h)
    {
        height = h;
    }
    
    public void setSpeed(int s)
    {
        speed = s;
    }
    
    public int getPosition()
    {
        int value = this.xPosition + (this.width/2);
        return value;
    }

    public boolean spaceBarPressed()
    {
        boolean space = false;
        if(keyStroke.getSpaceKeyStatus())
        {
            space = true;
        }
        return space;
    }
    
    @Override
    public void move()
    {
        if(keyStroke.getLeftKeyStatus() && this.getBounds().x > 0)
        {
            xPosition -= speed;
        }
        if(keyStroke.getRightKeyStatus() && this.getBounds().x + this.getBounds().width < 600)
        {
            xPosition += speed;
        }
    }

    @Override
    public Rectangle getBounds()
    {
        Rectangle rect = new Rectangle(xPosition, yPosition, width, height);
        return rect;
    }

    @Override
    public void draw(Graphics g)
    {
        
        g.setColor(color);
        g.fillRect(xPosition, yPosition, width, height);
        g.setColor(Color.white);
        g.drawRect(xPosition, yPosition, width, height);
    } 
}
