package Set.cursor;

    import java.util.Enumeration;
import java.util.Vector;

public class t1 {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(21);
        v.add(32);
        v.add(43);
        v.add(54);

        Enumeration<Integer> e = v.elements();

        while (e.hasMoreElements()) {
            int num = e.nextElement();
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}


