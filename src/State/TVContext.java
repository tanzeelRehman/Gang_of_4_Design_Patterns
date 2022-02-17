package State;

public class TVContext {
    public State getTvstate() {
        return tvstate;
    }
    public void setTvstate(State tvstate) {
        this.tvstate = tvstate;
    }

    public void doAction(){
         this.tvstate.doAction();
    }

    private State tvstate;
}
