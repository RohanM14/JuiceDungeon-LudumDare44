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
public class Room {

    public Room north;
    public Room south;
    public Room east;
    public Room west;
    public int roomNum;
    public ArrayList<GameObject> contents;
    
    public Room(int num) {
        roomNum = num;
    }
    
    public void addObject(GameObject obj) {
        contents.add(obj);
    }
    
    public Room getNorth() {
        return north;
    }
    
    public void setNorth(Room n) {
        north = n;
    }
    
    public void setSouth(Room s) {
        south = s;
    }
    
    public void setWest(Room w) {
        west = w;
    }
    
    public void setEast(Room e) {
        east = e;
    
    }
    public Room getSouth() {
        return south;
    }
    
    public Room getEast() {
        return east;
    }
    
    public Room getWest() {
        return west;
    }
    
}
