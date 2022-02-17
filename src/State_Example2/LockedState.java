package State_Example2;

public class LockedState extends State{
    LockedState(Player player) {
        super(player);
    }

    @Override
    public String onLockState() {
        if (player.isPlaying()) {
            player.changeState(new ReadyState(player));
            return "Stop playing";
        } else {
            return "Locked...";
        }
    }

    @Override
    public String onPlayState() {
        player.changeState(new ReadyState(player));
        return "Ready";
    }

    @Override
    public String onNextState() {
        return "locked...";
    }

    @Override
    public String onPreviousState() {
        return "Locked..";
    }
}
