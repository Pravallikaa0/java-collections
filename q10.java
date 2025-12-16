package Set;
import java.util.*;
public class q10{
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(Arrays.asList(30, 10, 20));
          int first = ((TreeSet<Integer>) set).first();
        System.out.println(first);
    }
}

