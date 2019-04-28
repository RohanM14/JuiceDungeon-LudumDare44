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
        Wall[] arrWalls = new Wall[44];
        SpriteLocation loc = new SpriteLocation(100, 0, 100, 100);
        int current = 0;
        for (int i = 0; i < 12; i++) {
            Wall top = new Wall(i*100, 0, loc);
            Wall bottom = new Wall(i*100, 1100, loc);
            arrWalls[current] = top;
            current++;
            arrWalls[current] = bottom;
            current++;
        }
        for (int j = 1; j < 10; j++) {
            Wall left = new Wall(0, j*100, loc);
            Wall right = new Wall(1100, j*100, loc);
            arrWalls[current] = left;
            current++;
            arrWalls[current] = right;
            current++;
        }
        if (north != null) {
            arrWalls[10] = null;
            arrWalls[12] = null;
        }
        if (east != null) {
            arrWalls[33] = null;
            arrWalls[35] = null;
        }
        if (south != null) {
            arrWalls[11] = null;
            arrWalls[13] = null;
        }
        if (west != null) {
            arrWalls[32] = null;
            arrWalls[34] = null;
        }
        for (int x = 0; x < arrWalls.length; x++) {
            walls.add(arrWalls[x]);
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
