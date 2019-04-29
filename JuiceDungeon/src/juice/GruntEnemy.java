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

import java.util.Timer;
import java.util.TimerTask;

/**
 * A basic enemy that has weak stats
 *
 * @author Kyle Bowman (kjbowman00)
 * @version 04/28/2019
 */
public class GruntEnemy extends Enemy {

    private boolean moving;
    private static final long moveTime = 2000;
    private static final double speed = 1;


    /**
     * @param startX
     * @param startY
     * @param location
     */
    public GruntEnemy(int startX, int startY) {
        super(startX, startY, new SpriteLocation(200, 0, 100, 100));
    }


    @Override
    public void tick() {
        if (moving) {
            super.tick();
        }
        else {
            moving = true;
            Player player = GameRunner.roomManager.getPlayer();
            double xDiff = Math.abs(player.getX() - this.getX());
            double yDiff = Math.abs(player.getY() - this.getY());
            if (xDiff > yDiff) {
                if (player.getX() > getX()) {
                    setXVelocity(speed);
                }
                else {
                    setXVelocity(-speed);
                }
            }
            else {
                if (player.getY() > getY()) {
                    setYVelocity(speed);
                }
                else {
                    setYVelocity(-speed);
                }
            }
            Timer timer = new Timer();
            timer.schedule(new MoveTimer(), moveTime);
        }

    }


    public class MoveTimer extends TimerTask {
        public void run() {
            moving = false;
            setXVelocity(0);
            setYVelocity(0);
        }
    }
}
