import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class sett {

    public static void main(String args[]) {
        // Set<Integer> nums = new HashSet<Integer>();
        Set<Integer> nums = new TreeSet<Integer>(); // give element in sorted order
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(40); // no duplicate elements
        // dot't support index
        // also dont provide in sorted order

        for (int i : nums) {
            System.err.println(i);
        }

    }
}
