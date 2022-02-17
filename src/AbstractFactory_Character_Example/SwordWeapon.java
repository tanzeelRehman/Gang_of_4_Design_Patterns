package AbstractFactory_Character_Example;

public class SwordWeapon extends Weapon{
    Gender gender;

    SwordWeapon(Gender gender){
        super(WeaponType.Sword);
        this.gender = gender;
        DrawWeapon();
    }
    @Override
    void DrawWeapon() {
        System.out.println(gender+" Drawing Sword Weapon");
    }
}
