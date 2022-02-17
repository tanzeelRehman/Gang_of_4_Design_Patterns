package AbstractFactory_Character_Example;

public class CharDemo {
    public static void main(String[] args) {
        CharFactory malechar = new MaleCharacter();
        CharFactory femalechar = new FemaleCharacter();
        malechar.drawArrowWeapon();
        malechar.drawSwordWeapon();

        femalechar.drawArrowWeapon();
        femalechar.drawSwordWeapon();
    }
}
