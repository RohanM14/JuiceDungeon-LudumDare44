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
    public ArrayList<Wall> walls;
    
    
    public Room(int num, Room n, Room e, Room s, Room w) {
        north = n;
        east = e;
        south = s;
        west = w;
        roomNum = num;
    }
    
    public void createWalls() {
        SpriteLocation loc = new SpriteLocation(100, 0, 100, 100);
        for (int i = 0; i < 12; i++) {
            Wall top = new Wall(i*100, 0, loc);
            Wall bottom = new Wall(i*100, 1100, loc);
            walls.add(top);
            walls.add(bottom);
        }
        for (int j = 1; j < 10; j++) {
            Wall left = new Wall(0, j*100, loc);
            Wall right = new Wall(1100, j*100, loc);
            walls.add(right);
            walls.add(left);
        }
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
