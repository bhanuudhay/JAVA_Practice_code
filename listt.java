import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class listt {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Original List: " + list);

        Collections.sort(list);
        System.out.println("Sorted List in Ascending Order: " + list);

        Collections.reverse(list);
        System.out.println("Sorted List in Descending Order: " + list);

        // Drawback is that in list we can add duplicate values too
    }
}
