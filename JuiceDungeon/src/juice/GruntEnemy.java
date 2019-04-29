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

/**
 * Add the class description here.
 *
 * @author Kyle Bowman (kjbowman00)
 * @version 04/28/2019
 */
public class GruntEnemy extends Enemy {

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
        
    }

}
