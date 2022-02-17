package Memento;

public class DemoMomento {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        originator originator = new originator(5, 10, careTaker);
        System.out.println("Default State: " + originator);
        originator.setX(originator.getY() * 51);
        System.out.println("State: " + originator);
        originator.createSavepoint("SAVE1");
        originator.setY(originator.getX() / 22);
        System.out.println("State: " + originator);
        originator.undolast();
        System.out.println("State after undo: " + originator);
        originator.setX(Math.pow(originator.getX(), 3));
        originator.createSavepoint("SAVE2");
        System.out.println("State: " + originator);
        originator.setY(originator.getX() - 30);
        originator.createSavepoint("SAVE3");
        System.out.println("State: " + originator);
        originator.setY(originator.getX() / 22);
        originator.createSavepoint("SAVE4");
        System.out.println("State: " + originator);
        originator.undo("SAVE2");
        System.out.println("Retrieving at: " + originator);
        originator.undoall();
        System.out.println("State after undo all: " + originator);
    }
}
