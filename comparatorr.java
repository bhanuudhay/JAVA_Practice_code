import java.util.*;
import java.util.Collections;
import java.util.Comparator;

public class comparatorr {
    public static void main(String args[]) {
        // the logic behind comparator is that we can use our own logic
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if (a % 10 > b % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }

        };
        List<Integer> nums = new ArrayList<>();
        nums.add(52);
        nums.add(11);
        nums.add(39);
        nums.add(15);

        // to sort we have inbuild class

        Collections.sort(nums, com);
        System.out.println(nums);
    }
}
