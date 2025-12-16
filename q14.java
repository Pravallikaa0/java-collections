package Set;
import java.util.*;
public class q14 {
public static void main(String[] args) {
        Set<Integer> A = new HashSet<>(Arrays.asList(1, 2));
        Set<Integer> B = new HashSet<>(Arrays.asList(1, 2, 3));
if (B.containsAll(A)) {
            System.out.println("A is subset of B");
        } else {
            System.out.println("A is not subset of B");
        }
    }
}

    

