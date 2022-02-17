package Command;

public class Remote {
    Device device;
    Remote(Device device){
        this.device = device;
    }
    public void  setDevice(Device device){
        this.device = device;
    }
    public void pressOn(){
        device.on();
    }
    public void  pressOff(){
        device.off();
    }
    public  void  pressUndo(){
        System.out.println("Undoing...");
    }
}
