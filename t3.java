package Set.cursor;
import java.util.*;
public class t3 {
  public static void main(String[] args) {
 ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("Hibernate");
     ListIterator<String> it = list.listIterator();
            System.out.println("Forward:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nBackward:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}

