package Set;
import java.util.*;
public class q13 {
 public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50));
          int x = 25;
        Integer next = set.higher(x);
   Set<Integer> result = set.tailSet(next);
 System.out.println(result);
    }
}

    

