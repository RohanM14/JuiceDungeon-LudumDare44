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
 * Runs the game loop
 *
 * @author Kyle Bowman (kjbowman00)
 * @version 04/27/2019
 */
public class GameRunner {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Create Window
        GameWindow window = new GameWindow();
        // Create room manager
        RoomManager roomManager = new RoomManager(window);
        
        // Wait for window to load
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Run game loop
        long frameCounter = 0;
        while (true) {
            long previousTime = System.nanoTime();
            long deltaTime = System.nanoTime() - previousTime;
            frameCounter += deltaTime;
            roomManager.tick(deltaTime);

            if (frameCounter >= 6000000) {
                frameCounter = 0;
                roomManager.paint();
            }
        }
    }

}
