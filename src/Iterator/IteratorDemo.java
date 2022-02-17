package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo
{
    public static void main(String[] args) {
        ArrayList<String> list  =new ArrayList<>() ;
        list.add("Shams");
        list.add("Ahsan");
        list.add("Asad");
        list.add("zeeshan");
        list.add("Tanzeel");
        Iterator<String> stringIterator = list.iterator();
       while (stringIterator.hasNext()){
           System.out.println(stringIterator.next());
       }

    }
}

// SUSCRIBER INTERFACE
// PUBLISHER INTERFACE
// ABSTRACT CLASS
// CONCRETE PUBLISHER
// NOTIFACTION METHOD
//

