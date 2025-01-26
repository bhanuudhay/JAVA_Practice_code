import java.util.*;
import java.util.Collections;
import java.util.Comparator;

public class camparatorrquest {
    public static void main(String args[]) {
        List<String> name = new ArrayList<>();

        Comparator<String> com = new Comparator<String>() {
            public int compare(String s1, String s2) {
                if ((s1.length()) < (s2.length())) {
                    return -1;
                } else {
                    return 1;
                }

            }
        };

        name.add("Bhanu");
        name.add("John");
        name.add("Sourav");
        name.add("Kamleshi");

        Collections.sort(name, com);
        System.out.println("List in ascending order of length:" + name);
    }
}
