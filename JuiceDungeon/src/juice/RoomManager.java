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
 * Manages the Rooms
 *
 * @author Rohan Muthukumar rohanm14
 * @author Kyle Bowman kjbowman00
 * @version 04/27/2019
 */
public class RoomManager {
    private Player player;
    private Canvas canvas;
    private Room[] rooms;
    private Room room;


    public RoomManager(Canvas canvas) {
        this.canvas = canvas;
        this.player = new Player(50, 50);
        rooms = LevelCreator.getRooms(1);
        room = rooms[0];
    }
    
    public Player getPlayer() {
        return player;
    }


    public void paint() {
        room.draw(canvas);
        player.draw(canvas);
    }


    public void tick(long deltaTime) {
        room.tick(deltaTime);
        player.tick(deltaTime);
    }
    

}
