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
    
    private static double deltaTime;
    public static RoomManager roomManager;
    

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpriteManager.setupSpriteSheet();
        // Create Window
        GameWindow window = new GameWindow();
        // Create room manager
        roomManager = new RoomManager(window);
        InputManager input = new InputManager(roomManager.getPlayer());
        window.addKeyListener(input);
        
        // Wait for window to load
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Run game loop
        long drawCounter = 0;
        // 60fps
        double drawTime = 1.0/ 60.0;
        long previousTime = System.nanoTime();
        while (true) {
            long nanoDeltaTime = System.nanoTime() - previousTime;
            deltaTime = ((double)nanoDeltaTime) / 1000000000.0d;
            previousTime = System.nanoTime();
            drawCounter += nanoDeltaTime;
            roomManager.tick();

            if (drawCounter >= 600000l) {
                drawCounter = 0;
                roomManager.paint();
            }
        }
    }
    
    public static double deltaTime() {
        return deltaTime;
    }

}
