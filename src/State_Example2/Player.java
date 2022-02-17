package State_Example2;

import java.util.ArrayList;
import java.util.List;

public class Player {
    boolean playing = false;
    private List<String> playlist = new ArrayList<>();
    int currentTrack =0;

    public State getState() {
        return state;
    }

    private  State state;

    Player(){
        for (int i = 0; i < 10; i++) {
            playlist.add("Track: "+i);
        }
    }
    public void changeState(State state){
        this.state = state;
    }
    public void setPlaying(boolean playing){
        this.playing = playing;
    }
    public boolean isPlaying(){
        return  playing;
    }
    public String startPlayback(){
        return "Playing "+playlist.get(currentTrack);
    }
    public String nextTrack(){
        if (currentTrack<playlist.size()-1){
            currentTrack++;
            return "Playing "+playlist.get(currentTrack);
        }
        currentTrack=0;
        return "Playing "+playlist.get(currentTrack);
    }
    public String previousTrack(){
        if (currentTrack>=1){
            currentTrack--;
            return "Playing "+playlist.get(currentTrack);
        }

        return "No previous track left";
    }
    public void setCurrentTrackAfterStop(){


        this.currentTrack=0;
    }


}
