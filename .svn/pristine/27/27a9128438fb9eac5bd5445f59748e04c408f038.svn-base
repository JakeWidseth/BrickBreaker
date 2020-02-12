/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObjects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author cocor
 */
public class Brick extends GameObject
{
    public int width;
    public int height;
    
    public Brick(int xPos, int yPos, int w, int h, Color c)
    {
       super(xPos, yPos, c);
       width = w;
       height = h;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public void setWidth(int w)
    {
        width = w;
    }
    
    public void setHeight(int h)
    {
        height = h;
    }
    
    public int getPosition()
    {
        int value = this.getBounds().x + (this.getBounds().width/2);
        return value;
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
