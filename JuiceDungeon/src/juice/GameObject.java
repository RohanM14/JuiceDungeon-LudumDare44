/**
 * Virginia Tech Honor Code Pledge:
 *
 * As a Hokie, I will conduct myself with honor
 * and integrity at all times.
 * I will not lie, cheat, or steal, nor will I
 * accept the actions of those who do.
 * -- Rohan Muthukumar (rohanm14)
 */
package juice;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;

/**
 * Add the class description here.
 *
 * @author Rohan Muthukumar rohanm14
 * @author Kyle Bowman kjbowman00
 * @version 04/27/2019
 */
public class GameObject {
   
    public double x;
    public double y;
    //Velocity stored as boxes per second (100 pixels per second)
    public double xVelocity = 0.1;
    public double yVelocity = 0.1;
    public Shape sprite;
    
    public static final long TIME_SCALE = 900000l;
    
    public GameObject(int startX, int startY, SpriteLocation location) {
        x = startX;
        y = startY;
        sprite = new Rectangle(5, 5);
    }
    
    public void tick(long deltaTime) {
        x += xVelocity * ((double)deltaTime) / ((double)TIME_SCALE);
        y += yVelocity * ((double)deltaTime) / ((double)TIME_SCALE);
    }
    
    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawLine(0, 0, 100, 100);
        g.drawOval((int)x, (int)y, 100, 100);
        g.fillOval((int)x, (int)y, 100, 100);
    }

    public void setXVelocity(int v) {
        xVelocity = v;
    }
    
    public void setYVelocity(int v) {
        yVelocity = v;
    }
    
    public double getXVelocity() {
        return xVelocity;
    }
    
    public double getYVelocity() {
        return yVelocity;
    }
}
