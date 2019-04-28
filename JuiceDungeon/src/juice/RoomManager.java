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

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Add the class description here.
 *
 * @author Rohan Muthukumar rohanm14
 * @author Kyle Bowman kjbowman00
 * @version 04/27/2019
 */
public class RoomManager {
    ArrayList<GameObject> gameObjects;
    public RoomManager() {
        gameObjects = new ArrayList<GameObject>();
        //TODO: remove this later
        GameObject temp = new GameObject(100, 100, null);
        gameObjects.add(temp);
    }
    
    public Iterator iterator() {
        return gameObjects.iterator();
    }
    
    
}
