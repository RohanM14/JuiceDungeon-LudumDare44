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

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

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
    // Velocity stored as boxes per second (100 pixels per second)
    public double xVelocity = 0;
    public double yVelocity = 0;
    public Image sprite;



    public GameObject(int startX, int startY, SpriteLocation location) {
        x = startX;
        y = startY;
        sprite = SpriteManager.getSprite(location);
    }


    public void tick() {
        x += xVelocity * GameRunner.deltaTime() * 100;
        y += yVelocity * GameRunner.deltaTime() * 100;
    }


    public void draw(Canvas canvas) {
        Graphics g = canvas.getBufferStrategy().getDrawGraphics();
        g.drawImage(sprite, (int)x, (int)y, canvas);
    }


    public void setXVelocity(double v) {
        xVelocity = v;
    }


    public void setYVelocity(double v) {
        yVelocity = v;
    }


    public double getXVelocity() {
        return xVelocity;
    }


    public double getYVelocity() {
        return yVelocity;
    }
}