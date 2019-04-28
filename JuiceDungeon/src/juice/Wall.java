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
public class Wall extends GameObject {

    public int x;
    public int y;
    public SpriteLocation loc;
    /**
     * @param startX
     * @param startY
     * @param location
     */
    public Wall(int startX, int startY, SpriteLocation location) {
        super(startX, startY, location);
        x = startX;
        y = startY;
        loc = location;
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public String toString() {
        return String.valueOf(x) + ", " + String.valueOf(y) + ", " + loc.toString();
    }
    
    

}
