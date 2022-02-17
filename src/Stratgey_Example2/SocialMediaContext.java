package Stratgey_Example2;

public class SocialMediaContext {
    SocialMediaStratgey stratgey;

    public void setStratgey(SocialMediaStratgey stratgey) {
        this.stratgey = stratgey;
    }

    public void connectTo(String soc){
        this.stratgey.connectTo(soc);
    }
}
