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
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;

/**
 * Add the class description here.
 *
 * @author Rohan Muthukumar rohanm14
 * @author Kyle Bowman kjbowman00
 * @version 04/27/2019
 */
public class RoomManager {
    private ArrayList<GameObject> gameObjects;
    private Player player;
    private Canvas canvas;
    private ArrayList<Room> rooms;
    private Room room;


    public RoomManager(Canvas canvas) {
        this.canvas = canvas;
        gameObjects = new ArrayList<GameObject>();
        this.player = new Player(50, 50);
        room = new Room(0, 1, -1, -1, -1);
        room.createWalls();
        for (int i = 0; i < room.getWalls().size(); i++) {
            gameObjects.add(room.getWalls().get(i));
        }
        gameObjects.add(player);
    }
    
    public Player getPlayer() {
        return player;
    }


    public void paint() {
        Iterator<GameObject> iterator = gameObjects.iterator();
        while (iterator.hasNext()) {
            GameObject obj = iterator.next();
            obj.draw(canvas);
        }
        canvas.getBufferStrategy().show();
        canvas.getBufferStrategy().dispose();
        canvas.createBufferStrategy(2);
    }


    public void tick(long deltaTime) {
        Iterator<GameObject> iterator = gameObjects.iterator();
        while (iterator.hasNext()) {;
            GameObject obj = iterator.next();
            obj.tick(deltaTime);
        }
    }
    
    private void createRooms() {
        JsonFactory parser = new JsonFactory();
    }

}
