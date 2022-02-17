package Stratgey_Example2;

public class GooglePlusStratgey implements  SocialMediaStratgey{
    @Override
    public void connectTo(String soc) {
        System.out.println("Connected To "+ soc);
    }
}
