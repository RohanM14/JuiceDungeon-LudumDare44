/*
 * Virginia Tech Honor Code Pledge:
 *
 * As a Hokie, I will conduct myself with honor
 * and integrity at all times.
 * I will not lie, cheat, or steal, nor will I
 * accept the actions of those who do.
 * -- Kyle Bowman (kjbowman00)
 */
package juice;

import java.util.ArrayList;

/**
 * Hard codes all the levels, because Jackson Library was gross
 *
 * @author Kyle Bowman (kjbowman00)
 * @version 04/28/2019
 */
public class LevelCreator {
    public static Room[] getRooms(int level) {
        Room[] rooms = new Room[16];
        if (level == 1) {
            rooms[0] = new Room(0, 2, 1, 4, 3 );
            Room l = rooms[0];
            l.createWalls();
            l.addObject(new Player(10, 50));
            l.addObject(new Player(100, 75));
            l.addObject(new Player(175, 300));
            l.addObject(new Player(500, 600));
        }
        return rooms;
    }
}
