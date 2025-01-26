import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class foreachfunct {
    public static void main(String args[]) {
        List<Integer> nums = Arrays.asList(2, 4, 3, 6, 7, 9, 4);
        // traditional approach to print element in list

        /*
         * for(int i =0 ; i<= nums.size() ;i++)
         * {
         * System.out.println(nums.get(i));
         * }
         */

        // or

        // using advacned loop
        /*
         * for (int i : nums) {
         * System.out.println(i);
         * }
         */
        // to make it more faster we use foreach

        /*
         * Consumer<Integer> con = new Consumer<Integer>() {
         * public void accept(Integer n) {
         * // you can do whatever you want to do in this block
         * System.out.println(n);
         * }
         * 
         * };
         * nums.forEach(con);
         */

        // we know that consume is a interface we can use lemda

        // Consumer<Integer> con = n -> System.out.println(n);
        // you can do whatever you want to do in this block

        nums.forEach(n -> System.out.println(n));

    }
}