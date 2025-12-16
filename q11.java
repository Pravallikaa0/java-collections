package Set;
import java.util.*;
public class q11{
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(Arrays.asList(30, 10, 20));
        int last = ((TreeSet<Integer>) set).last();
         System.out.println(last);
    }
}

    

