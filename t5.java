package Set.cursor;
  import java.util.*;
public class t5 {
  
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
         Iterator<Integer> it = list.iterator();
        int count = 0;
         while (it.hasNext()) {
            it.next();
            count++;
        }

        System.out.println("Count = " + count);
    }
}

