package Set;
  import java.util.*;
public class q12 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50));
        int x = 35;
           Set<Integer> result = set.headSet(x);
          System.out.println(result);
    }
}

