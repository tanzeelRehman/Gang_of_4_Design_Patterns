package Prototype;

public class Demo {
    public static void main(String[] args) {
        Human human1 = new Human("Tanzeel","Rehman",22);
        Human human2 = (Human) human1.getClone();

    }

}
