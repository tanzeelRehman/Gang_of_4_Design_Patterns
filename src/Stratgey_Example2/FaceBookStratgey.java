package Stratgey_Example2;

public class FaceBookStratgey implements SocialMediaStratgey{
    @Override
    public void connectTo(String soc) {
        System.out.println( soc+ "is Connected To Facebook Stratgey");
    }
}
