package State_Example2;

public class ReadyState extends State{
    ReadyState(Player player) {
        super(player);
    }

    @Override
    public String onLockState() {
        player.changeState(new LockedState(player));
        player.setCurrentTrackAfterStop();
        return "Stopped Playing...";
    }

    @Override
    public String onPlayState() {
        player.changeState(new PlayingState(player));
        String action = player.startPlayback();
        return action;
    }

    @Override
    public String onNextState() {
        return player.nextTrack();
    }

    @Override
    public String onPreviousState() {
        return player.previousTrack();
    }
}
