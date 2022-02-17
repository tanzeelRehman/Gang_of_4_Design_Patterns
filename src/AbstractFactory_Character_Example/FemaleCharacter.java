package AbstractFactory_Character_Example;

public class FemaleCharacter implements CharFactory{
    @Override
    public Weapon drawSwordWeapon() {
        return new SwordWeapon(Gender.Female);
    }

    @Override
    public Weapon drawArrowWeapon() {
        return new ArrowWeapon(Gender.Female);
    }
}
