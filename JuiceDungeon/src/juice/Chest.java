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

/**
 * Add the class description here.
 *
 * @author Rohan Muthukumar rohanm14
 * @version 04/27/2019
 */
public class Chest extends GameObject {

    
    public GameObject contents;
    private int health = 1;
    /**
     * @param startX
     * @param startY
     * @param location
     */
    public Chest(int startX, int startY, SpriteLocation location, GameObject item) {
        super(startX, startY, location);
        contents = item;
        // TODO Auto-generated constructor stub
    }  
    
}
