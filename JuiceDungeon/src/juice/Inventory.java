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

import java.util.ArrayList;

/**
 * Add the class description here.
 *
 * @author Rohan Muthukumar rohanm14
 * @version 04/27/2019
 */
public class Inventory {

    public ArrayList<Integer> amount;
    public ArrayList<ENUMItem> contents;
    public int current;
    
    public Inventory() {
        contents = new ArrayList<ENUMItem>(4);
        contents.add(ENUMItem.DAMAGE_BOOST);
        contents.add(ENUMItem.SPEED_BOOST);
        contents.add(ENUMItem.HEALTH_BOOST);
        contents.add(ENUMItem.EXPLOSIVE);
        amount = new ArrayList<Integer>(4);
        current = 0;
    }
    
    public ENUMItem getItem() {
        return contents.get(current);
    }
    
    public int nextItem() {
        current++;
        return current;
    }
}
