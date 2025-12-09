package Set.cursor;

import java.util.*;

public class t2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Ball");
        list.add("Ant");
        list.add("Cat");
        list.add("Axe");
        list.add("Dog");
       Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String s = it.next();
            if (s.startsWith("A")) {
                it.remove(); 
            }
        }

        System.out.println(list);
    }
}
