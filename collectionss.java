import java.util.Collection;
import java.util.ArrayList;

public class collectionss {
    public static void main(String args[]) {
        // Collection<Integer> nums = new ArrayList<Integer>();
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(10);
        nums.add(4);
        nums.add(9);
        nums.add(17);
        for (int n : nums) {
            System.out.println(n);
        } // this normally work but if we want to work with index then we use list
    }
}
