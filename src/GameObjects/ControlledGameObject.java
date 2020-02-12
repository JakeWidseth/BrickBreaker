/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObjects;

import Controller.KeyboardController;
import Interfaces.Moveable;
import java.awt.Color;

/**
 *
 * @author cocor
 */
public abstract class ControlledGameObject extends GameObject implements Moveable
{
    KeyboardController keyStroke;
    public ControlledGameObject(int xPos, int yPos, Color c, KeyboardController control)
    {
        super(xPos, yPos, c);
        keyStroke = control;
    }
     
}
