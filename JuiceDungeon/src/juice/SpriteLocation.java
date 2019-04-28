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
public class SpriteLocation {

    public int x;
    public int y;
    public int length;
    public int width;
    
    public SpriteLocation(int startX, int startY, int spriteLength, int spriteWidth) {
        x = startX;
        y = startY;
        length = spriteLength;
        width = spriteWidth;
    }
    
    @Override
    public String toString() {
        return String.valueOf(x) + ", " + String.valueOf(y) + ", " + String.valueOf(length) + ", " + String.valueOf(width); 
    }
}
