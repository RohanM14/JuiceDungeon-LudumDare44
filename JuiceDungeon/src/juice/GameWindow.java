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
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;
import javax.swing.JFrame;

/**
 * Displays the game window
 *
 * @author Kyle Bowman (kjbowman00)
 * @version 04/27/2019
 */
public class GameWindow extends Canvas{
    RoomManager roomManager;
    public GameWindow(RoomManager roomManager) {
        this.roomManager = roomManager;
        JFrame frame = new JFrame("Juice Dungeon");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
               System.exit(0);
            }        
         });    
        this.setSize(800, 600);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
    }
    
    //TODO: Add drawing functions for images, squares, whatever
    public void paint() {
        //Clear the canvas
        Graphics g = this.getGraphics();
        super.paint(g);
        
        //Draw all images from RoomManager
        Iterator<GameObject> iterator = roomManager.iterator();
        while (iterator.hasNext()) {
            GameObject object = iterator.next();
            object.draw(g);
        }
    }
}
