/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObjects;

import Interfaces.Drawable;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author cocor
 */
public abstract class GameObject implements Drawable
{
    public int xPosition;
    public int yPosition;
    public Color color;
    
    public GameObject(int x, int y, Color c)
    {
        xPosition = x;
        yPosition = y;
        color = c;
    }
    
    public abstract Rectangle getBounds();
    
    public int getXPosition()
    {
        return xPosition;
    }
    
    public int getYPosition()
    {
        return yPosition;
    }
    
    public Color getColor()
    {
        return color;
    }
    
    public void setXPosition(int x)
    {
        xPosition = x;
    }
    
    public void setYPosition(int y)
    {
        yPosition = y;
    }
    
    public void setColor(Color c)
    {
        color = c;
    }
    
    public boolean isColliding(GameObject other)
    {
        boolean isColliding = false;
        
        if(this.getBounds().x + this.getBounds().width >= other.getBounds().x && this.getBounds().x <= other.getBounds().x + other.getBounds().width)
        {
            if(this.getBounds().y + this.getBounds().height >= other.getBounds().y && this.getBounds().y <= other.getBounds().y + other.getBounds().height)
            {
                isColliding = true;
            }
        }
  
        return isColliding;
    }
}
