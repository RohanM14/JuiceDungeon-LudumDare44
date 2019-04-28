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

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.text.JTextComponent.KeyBinding;

/**
 * Handles input from the keyboard
 *
 * @author Kyle Bowman (kjbowman00)
 * @version 04/27/2019
 */
public class InputManager implements KeyListener {

    private boolean rightHeld;
    private boolean leftHeld;
    private boolean upHeld;
    private boolean downHeld;
    private Player player;
    private static final double PLAYER_SPEED = 1;
    
    public InputManager(Player player) {
        this.player = player;
    }


    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.KeyListener#keyPressed(java.awt.event.KeyEvent)
     */
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            leftHeld = true;
            player.setXVelocity(-PLAYER_SPEED);
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            rightHeld = true;
            player.setXVelocity(PLAYER_SPEED);
        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
            upHeld = true;
            player.setYVelocity(-PLAYER_SPEED);
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            downHeld = true;
            player.setYVelocity(PLAYER_SPEED);
        }
        
    }


    /*
     * (non-Javadoc)
     * 
     * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
     */
    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            leftHeld = false;
            if (rightHeld) {
                player.setXVelocity(PLAYER_SPEED);
            } else {
                player.setXVelocity(0);
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            rightHeld = false;
            if (leftHeld) {
                player.setXVelocity(-PLAYER_SPEED);
            } else {
                player.setXVelocity(0);
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
            upHeld = false;
            if (downHeld) {
                player.setYVelocity(PLAYER_SPEED);
            } else {
                player.setYVelocity(0);
            }
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            downHeld = false;
            if (upHeld) {
                player.setYVelocity(-PLAYER_SPEED);
            } else {
                player.setYVelocity(0);
            }
        }

    }


    /* (non-Javadoc)
     * @see java.awt.event.KeyListener#keyTyped(java.awt.event.KeyEvent)
     */
    @Override
    public void keyTyped(KeyEvent e) {
        //Nothing
    }

}
