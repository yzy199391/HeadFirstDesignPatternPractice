package design.practice.page.sixty.three.character;

import design.practice.page.sixty.three.behavior.IWeaponBehavior;

/**
 * @author yanzy
 * @date 2018/10/18 上午9:05
 * @description
 */
public interface ICharactor {

    void fight();

    void setWeaponBehavior(IWeaponBehavior weaponBehavior);
}
