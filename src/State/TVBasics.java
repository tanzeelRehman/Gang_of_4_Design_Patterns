package State;

public class TVBasics {
    public void setState(String state) {
        this.state = state;
    }

    private String state ="";



    public static void main(String[] args) {
       TVContext context = new TVContext();
       State onstate = new TVOnState();
       context.setTvstate(onstate);
       context.doAction();
        State offstate = new TVOFFState();
        context.setTvstate(offstate);
        context.doAction();


    }

}
