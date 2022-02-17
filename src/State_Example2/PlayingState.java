package State_Example2;

public class PlayingState extends State{
    PlayingState(Player player) {
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
        player.changeState(new ReadyState(player));

        return "Player is ready...";
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
