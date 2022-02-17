package AbstractFactory_Character_Example;

public class ArrowWeapon extends Weapon {
    Gender gender;
    public ArrowWeapon(Gender gender) {
        super(WeaponType.Arrow);
        this.gender = gender;

        DrawWeapon();
    }

    @Override
    void DrawWeapon() {
        System.out.println(gender+" Character Drawing Arrow Weapon");
    }
}
