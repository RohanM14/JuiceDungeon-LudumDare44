/*
 * Virginia Tech Honor Code Pledge:
 *
 * As a Hokie, I will conduct myself with honor
 * and integrity at all times.
 * I will not lie, cheat, or steal, nor will I
 * accept the actions of those who do.
 * -- Kyle Bowman (kjbowman00)
 */
package juice;

import java.awt.Canvas;
import javax.swing.JFrame;

/**
 * Displays the game window
 *
 * @author Kyle Bowman (kjbowman00)
 * @version 04/27/2019
 */
public class GameWindow extends Canvas{
    public GameWindow() {
        JFrame frame = new JFrame("Juice Dungeon");
        this.setSize(800, 600);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
    }
    
    //TODO: Add drawing functions for images, squares, whatever
}
