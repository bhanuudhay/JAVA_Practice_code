import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamm {
    public static void main(String args[]) {
        // so basically you have a question that is you have a list .You have to perform
        // specific operation on it
        // 1 only even element in the list
        // 2 double the value you get
        // 3 sum of the doubled value

        // tradition approach

        List<Integer> nums = Arrays.asList(4, 3, 5, 6, 7, 3, 6, 9, 4);
        /*
         * int sum = 0;
         * for (int i : nums) {
         * if (i % 2 == 0) {
         * i = i * 2;
         * sum = sum + i;
         * }
         * }
         * System.out.println(sum);
         */

        // advanced approach using stream

        Stream<Integer> s1 = nums.stream();
        /*
         * Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
         * Stream<Integer> s3 = s2.map(n -> n * 2);
         * int result = s3.reduce(0, (c, d) -> c + d);
         * 
         * System.out.println(result);
         */

        // to make more professional

        int result = s1.filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, d) -> c + d);
        System.out.println(result);

        // we also have .sorted method that is store in another stream

    }

}
