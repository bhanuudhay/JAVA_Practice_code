import java.util.*;
import java.util.Collections;

public class sortingg {
    public static void main(String args[]) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(10);
        nums.add(30);
        nums.add(15);

        // to sort we have inbuild class

        Collections.sort(nums);

        // or we can directly use

        Arrays.sort(nums);
        System.out.println("Sorted list in ascending order: " + nums);

    }

}
