package Set.cursor;
 import java.util.*;
public class t4 {
   
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("tom");
        list.add("john");
        list.add("david");

        ListIterator<String> it = list.listIterator();

        while (it.hasNext()) {
            String name = it.next();
            it.set(name.toUpperCase()); 
        }
          System.out.println(list);
    }
}

    

