/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObjects;

import Interfaces.Moveable;
import java.awt.Color;

/**
 *
 * @author cocor
 */
public abstract class MovingGameObject extends GameObject implements Moveable
{
    public int xVelocity;
    public int yVelocity;
    
    public MovingGameObject(int xPos, int yPos, int xVel, int yVel, Color c)
    {
        super(xPos, yPos, c);
        xVelocity = xVel;
        yVelocity = yVel;
    }
    
    public int getXVelocity()
    {
        return xVelocity;
    }
    
    public int getYVelocity()
    {
        return yVelocity;
    }
    
    public void setXVelocity(int xVel)
    {
        xVelocity = xVel;
    }
    
    public void setYVelocity(int yVel)
    {
        yVelocity = yVel;
    }

    @Override
    public void move()
    {
        xPosition += xVelocity;
        yPosition += yVelocity;
    }
    
    
}
