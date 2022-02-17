package Memento;

public class originator {
   private double x;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

   private double y;
    String lastundosavepoint;
     CareTaker careTaker;
    originator(double x, double y, CareTaker careTake){
        this.x = x;
        this.y = y;
        careTaker = careTake;

    }

    public void  createSavepoint(String content){
        lastundosavepoint=content;
            careTaker.saveMomento(new originator.Memento(this.x,this.y),content);
    }
    public void  undolast(){
        careTaker.getMomento(lastundosavepoint);
    }
    public void  undo(String content){
        careTaker.getMomento(content);
    }
    public void  undoall(){
        careTaker.clear();
    }

    public void  setOrignator(String state){
        Memento mm =(Memento) careTaker.getMomento(state);
        this.x = mm.x;
        this.y = mm.y;


    }

    @Override
    public String toString() {
        return "Origanator{" +
                "x=" + x +
                ", y=" + y +
                ", lastundosavepoint='" + lastundosavepoint + '\'' +

                '}';
    }

    class Memento {
        private double x;

        public Memento(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        private double y;
    }
}
