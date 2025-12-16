package Set;
import java.util.*;
public class q16 {
     public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 10, 15));
            Iterator<Integer> it = set.iterator();
            System.out.print("Printed values: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}


