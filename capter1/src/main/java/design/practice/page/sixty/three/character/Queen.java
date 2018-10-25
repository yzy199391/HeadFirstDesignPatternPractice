package design.practice.page.sixty.three.character;

import design.practice.page.sixty.three.behavior.BowAndArrowBehavior;
import design.practice.page.sixty.three.behavior.IWeaponBehavior;

/**
 * @author yanzy
 * @date 2018/10/18 上午9:20
 * @description
 */
public class Queen implements ICharactor {
    IWeaponBehavior weaponBehavior = new BowAndArrowBehavior();

    public void fight() {
        this.weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(IWeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }
}
