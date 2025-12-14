package Set;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<Integer,String> m=new HashMap<Integer,String>();
        m.put(1,"avi" );
         m.put(2,"you" );
          m.put(3,"ant" );
           m.put(4,"cat" );
            m.put(5,"owl" );
            System.out.println(m.get(3));   
            System.out.println(m.getOrDefault(7, "Not Found"));
           System.out.println( m.containsKey(2)); 
            System.out.println(m.containsValue("Apple"));
            System.out.println(m.remove(1));
            System.out.println(m.size());
            System.out.println(m.isEmpty());
            System.out.println(m.replace(2, "Grapes"));
           System.out.println( m.putIfAbsent(3, "Orange"));


















    }}