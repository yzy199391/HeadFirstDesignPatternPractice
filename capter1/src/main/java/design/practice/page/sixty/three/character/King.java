package design.practice.page.sixty.three.character;

import design.practice.page.sixty.three.behavior.IWeaponBehavior;
import design.practice.page.sixty.three.behavior.SwordBehavior;

/**
 * @author yanzy
 * @date 2018/10/18 上午9:16
 * @description
 */
public class King implements ICharactor {
    IWeaponBehavior weaponBehavior = new SwordBehavior();

    public void fight() {
        this.weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(IWeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }
}
