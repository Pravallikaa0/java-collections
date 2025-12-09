package Set;

import java.util.HashSet;

public class method_hashset {
    public static void main(String[] args) {
        HashSet<Integer> s=new HashSet<Integer>();
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(30);
        s.add(10);
        s.add(60);
        s.add(70);
        s.add(90);
        System.out.println(s);
        s.remove(70);
        System.out.println(s);
       System.out.println("Contains 40? " + s.contains(40));
           System.out.println("Contains 50? " + s.contains(50));
                 
           System.out.println("Size of set: " + s.size());

       System.out.println("Is set empty? " + s.isEmpty());

         
           HashSet<Integer> v=new HashSet<Integer>();
           v.add(33);
           v.add(44);
           v.add(55);
           v.add(88);
            s.addAll(v);
             System.out.println(s);
             s.retainAll(v);
            System.out.println(s);
            s.removeAll(v);
             System.out.println(s);


    }
    
}
