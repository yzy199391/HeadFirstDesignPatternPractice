package design.practice.page.sixty.three.character;

import design.practice.page.sixty.three.behavior.AxeBehavior;
import design.practice.page.sixty.three.behavior.IWeaponBehavior;

/**
 * @author yanzy
 * @date 2018/10/18 上午9:26
 * @description
 */
public class Troll implements ICharactor {
    IWeaponBehavior weaponBehavior = new AxeBehavior();

    public void fight() {
        this.weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(IWeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
