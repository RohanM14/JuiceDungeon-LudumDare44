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
public enum ENUMWeapon {

    DAGGER(1, 1, 1, 3), KATANA(3, 2, 1, 2), MEAT_STICK(5, 3, 5, 1);
    
    ENUMWeapon(int damage, int range, int knockback, int speed) {
        this.range = range;
        this.damage = damage;
        this.knockback = knockback;
        this.speed = speed;
    }
    
    private final int range;
    private final int damage;
    private final int knockback;
    private final int speed;
    
    public int getRange() {
        return range;
    }
    
    public int getDamage() {
        return damage;
    }
    
    public int getKnockback() {
        return knockback;
    }
    
    public int getSpeed() {
        return speed;
    }
}
