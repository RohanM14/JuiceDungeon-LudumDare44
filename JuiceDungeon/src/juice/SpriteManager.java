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

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Manages sprites
 *
 * @author Kyle Bowman (kjbowman00)
 * @version 04/27/2019
 */
public class SpriteManager {
    private static BufferedImage spriteSheet;


    public static void setupSpriteSheet() {
        try {
            spriteSheet = ImageIO.read(new File("spritesheet.png"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Image getSprite(SpriteLocation location) {
        return spriteSheet.getSubimage(location.x, location.y, location.width,
            location.length);
    }
}
