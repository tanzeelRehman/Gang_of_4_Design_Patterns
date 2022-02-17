package Stratgey_Example2;

public class Demo {
    public static void main(String[] args) {
        SocialMediaContext context = new SocialMediaContext();
        context.setStratgey(new FaceBookStratgey());
        context.connectTo("Lokesh");
        System.out.println("++++++++++++++++++++++++++++++++");
        context.setStratgey(new FaceBookStratgey());
        context.connectTo("Ali");
    }
}
