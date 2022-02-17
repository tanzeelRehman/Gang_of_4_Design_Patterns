package Singleton;

public class Singelton {
    private Singelton(){}
    private static  Singelton INSTANCE;
    public static Singelton getInstance() {
        if(INSTANCE==null){
            INSTANCE =  new Singelton();
        }
        return INSTANCE;
    }
    void executeQuery (){
        System.out.println("Query has been executed");
    }

}
