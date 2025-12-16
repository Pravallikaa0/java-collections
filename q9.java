package Set;
 import java.util.*;
public class q9 {
   public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "a", "b");
         Set<String> set = new HashSet<>(list);
          System.out.println(set);
    }
}
