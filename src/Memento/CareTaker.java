package Memento;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {


    private final Map<String, Object> savepointStorage = new HashMap<>();
    public  void saveMomento(Object momento, String content){
        savepointStorage.put(content,momento);
    }
    public Object getMomento(String key){

        return savepointStorage.get(key);
    }
    public void clear(){
        savepointStorage.clear();
    }
}
