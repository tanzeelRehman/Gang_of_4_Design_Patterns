package State_Example2;

public abstract class State {
    Player player;

    State(Player player){
        this.player = player;
        player.changeState( new ReadyState(player));
    }
    public  abstract String onLockState();
    public  abstract String onPlayState();
    public  abstract String onNextState();
    public  abstract String onPreviousState();
}
