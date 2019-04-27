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

/**
 * Add the class description here.
 *
 * @author Rohan Muthukumar rohanm14
 * @version 04/27/2019
 */
public enum Weapon {

    DAGGER(1), KATANA(2), MEAT_STICK(3);
    
    Weapon(int range) {
        this.range = range;
    }
    
    private final int range;
    
    public int getRagne() {
        return range;
    }
}
