package design.practice.page.sixty.three;

import design.practice.page.sixty.three.behavior.AxeBehavior;
import design.practice.page.sixty.three.behavior.IWeaponBehavior;
import design.practice.page.sixty.three.character.ICharactor;
import design.practice.page.sixty.three.character.King;

/**
 * @author yanzy
 * @date 2018/10/18 上午9:30
 * @description 策略模式demo
 */
public class Main {
    public static void main(String[] args) {
        //创建国王对象
        ICharactor charactor = new King();
        charactor.fight();

        //更换武器
        IWeaponBehavior weaponBehavior = new AxeBehavior();
        charactor.setWeaponBehavior(weaponBehavior);
        charactor.fight();
    }
}
