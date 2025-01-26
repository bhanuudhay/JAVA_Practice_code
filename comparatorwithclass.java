import java.util.*;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void printt() {
        System.out.println("age : " + age + " Name :" + name);
    }

    public int compareTo(Student that) {
        if (this.age > that.age) {
            return 1;
        } else if (this.age < that.age) {
            return -1;
        } else {
            return 0;
        }
    }

}

public class comparatorwithclass {
    public static void main(String args[]) {
        List<Student> studs = new ArrayList<>();

        /*
         * Comparator<Students> com = new Comparator<Students>() {
         * public int compare(Students s1, Students s2) {
         * 
         * }
         * };
         */ // then their is no need of , com to use

        studs.add(new Student(23, "Bhanu"));
        studs.add(new Student(13, "Arpit"));
        studs.add(new Student(27, "Ujwal"));
        studs.add(new Student(40, "Arman"));

        Collections.sort(studs); // if we dont want to use ,com then

        for (Student s : studs) {
            s.printt();
        }
    }
}