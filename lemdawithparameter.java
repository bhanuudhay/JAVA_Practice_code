interface A {
    int show(int x, int b);
}

public class lemdawithparameter {
    public static void main(String[] args) {
        A a = (x, b) -> x + b;
        System.out.println(a.show(10, 20));
    }

}
