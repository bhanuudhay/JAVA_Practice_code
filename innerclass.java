class A {
    int c;

    public void outer() {
        System.out.println("In outer class");
    }

    static class B {        public void inner() {
            System.out.println("In inner class");
        }
    }
}
public class innerclass {
    public static void main(String[] args) {
        A obj = new A();
        obj.outer();

        /*
         * A.B obj1 = obj.new B();
         * obj1.inner();
         */ // if inner inner class is non static

        // if inner class is static

        A.B obj1 = new A.B();
        obj1.inner();
    }
}