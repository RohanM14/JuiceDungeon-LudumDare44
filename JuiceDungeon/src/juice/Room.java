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

import java.awt.Canvas;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Add the class description here.
 *
 * @author Rohan Muthukumar rohanm14
 * @version 04/27/2019
 */
public class Room {

    public int north;
    public int south;
    public int east;
    public int west;
    public int roomNum;
    public ArrayList<GameObject> contents;
    public ArrayList<Wall> walls;
    
    
    public Room(int num, int n, int e, int s, int w) {
        north = n;
        east = e;
        south = s;
        west = w;
        roomNum = num;
        walls = new ArrayList<Wall>();
        contents = new ArrayList<GameObject>();
    }
    
    public void tick() {
        Iterator<GameObject> iterator = contents.iterator();
        Iterator<Wall> i2 = walls.iterator();
        while (iterator.hasNext()) {
            GameObject obj = iterator.next();
            obj.tick();
        }
        while (i2.hasNext()) {
            GameObject obj = i2.next();
            obj.tick();
        }
    }
    
    public void draw(Canvas canvas) {
        Iterator<GameObject> iterator = contents.iterator();
        Iterator<Wall> i2 = walls.iterator();
        while (iterator.hasNext()) {
            GameObject obj = iterator.next();
            obj.draw(canvas);
        }
        while (i2.hasNext()) {
            GameObject obj = i2.next();
            obj.draw(canvas);
        }
        canvas.getBufferStrategy().show();
        canvas.getBufferStrategy().dispose();
        canvas.createBufferStrategy(2);
    }
    
    public Wall[] createWalls() {
        Wall[] arrWalls = new Wall[42];
        SpriteLocation loc = new SpriteLocation(100, 0, 100, 100);
        int current = 0;
        for (int i = 0; i < 10; i++) {
            Wall top = new Wall(i*100, 0, loc);
            Wall bottom = new Wall(i*100, 700, loc);
            arrWalls[current] = top;
            current++;
            arrWalls[current] = bottom;
            current++;
        }
        for (int j = 1; j < 8; j++) {
            Wall left = new Wall(0, j*100, loc);
            Wall right = new Wall(900, j*100, loc);
            arrWalls[current] = left;
            current++;
            arrWalls[current] = right;
            current++;
        }
        if (north >= 0) {
            arrWalls[8] = null;
            arrWalls[10] = null;
        }
        if (east >= 0) {
            arrWalls[27] = null;
            arrWalls[25] = null;
        }
        if (south >= 0) {
            arrWalls[9] = null;
            arrWalls[11] = null;
        }
        if (west >= 0) {
            arrWalls[26] = null;
            arrWalls[24] = null;
        }
        for (int x = 0; x < arrWalls.length - 1; x++) {
            if (arrWalls[x] != null) {
                walls.add(arrWalls[x]);
            }
        }
        return arrWalls;
    }
    
    public ArrayList<Wall> getWalls() {
        return walls;
    }
    
    public void addObject(GameObject obj) {
        contents.add(obj);
    }
    
    public int getNorth() {
        return north;
    }
    
    public int getSouth() {
        return south;
    }
    
    public int getEast() {
        return east;
    }
    
    public int getWest() {
        return west;
    }
    
}
