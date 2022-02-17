package AbstractFactory_Character_Example;

public abstract class Weapon {
    WeaponType weaponType;
    abstract void DrawWeapon();

    Weapon(WeaponType type){
        this.weaponType = type;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "WeaponType=" + weaponType +
                '}';
    }
}
