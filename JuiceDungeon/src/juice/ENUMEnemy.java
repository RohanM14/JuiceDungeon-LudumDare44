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
 * @version 04/28/2019
 */
public enum ENUMEnemy {

    GRUNT(2, 1, 1, 2, 2), FLYING(1, 1, 0, 4, 3), OUTLAW(1, 1, 1, 1, 3), TANK(3, 2, 5, 1, 1), BOSS(5, 3, 3, 0, 1);
    
    ENUMEnemy(int damage, int range, int knockback, int moveSpeed, int atkSpeed) {
        this.range = range;
        this.damage = damage;
        this.knockback = knockback;
        this.moveSpeed = moveSpeed;
        this.atkSpeed = atkSpeed;
    }
    
    private final int range;
    private final int damage;
    private final int knockback;
    private final int moveSpeed;
    private final int atkSpeed;
    
    public int getRange() {
        return range;
    }
    
    public int getDamage() {
        return damage;
    }
    
    public int getKnockback() {
        return knockback;
    }
    
    public int getMoveSpeed() {
        return moveSpeed;
    }
    
    public int getAtkSpeed() {
        return atkSpeed;
    }
}
