package Set;

import java.util.*;

public class Linkedhashmap_meothos {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> a=new LinkedHashMap<>();

        a.put(1,"abi");
        a.put(2,"xyz");
        a.put(3,"elsa");
        a.put(4,"adi");
        a.put(5,"adeel");
        a.put(6,"zyx");
        a.put(7,"sri");

        System.out.println("Initial Map: " + a);
         System.out.println("Value for key 6: " + a.get(6));
        a.remove(6);
        System.out.println("After removing key 6: " + a);
        System.out.println("Contains key 1? " + a.containsKey(1));
          System.out.println("Contains value 'b'? " + a.containsValue("b"));
        System.out.println("Size of map: " + a.size());
        System.out.println("Is Empty? " + a.isEmpty());
           System.out.println("All keys: " + a.keySet());
          System.out.println("All values: " + a.values());
    }
}
