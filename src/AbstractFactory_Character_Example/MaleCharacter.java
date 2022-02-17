package AbstractFactory_Character_Example;

public class MaleCharacter implements CharFactory{


    @Override
    public Weapon drawSwordWeapon() {
        return new SwordWeapon(Gender.Male);
    }

    @Override
    public Weapon drawArrowWeapon() {
        return new ArrowWeapon(Gender.Male);
    }
}
