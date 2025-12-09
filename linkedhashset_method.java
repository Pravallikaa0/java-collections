package Set;

import java.util.*;
public class linkedhashset_method{
    public static void main(String[] args) {
        
    
    LinkedHashSet<Integer> a=new LinkedHashSet<>();
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(30);
        a.add(10);
        a.add(60);
        a.add(70);
        a.add(90);
        System.out.println(a);
       System.out.println( a.remove(70));
       System.out.println( a.contains(70));
       System.out.println(a.size());
         System.out.println(a.isEmpty());
        
          LinkedHashSet<Integer> v=new LinkedHashSet<Integer>();
           v.add(33);
           v.add(44);
           v.add(55);
           v.add(88);
            a.addAll(v);
             System.out.println(a);
             a.retainAll(v);
            System.out.println(a);
            a.removeAll(v);
             System.out.println(a);
             


}   }   