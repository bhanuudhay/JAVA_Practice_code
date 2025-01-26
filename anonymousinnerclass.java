class A {
    public void show() {
        System.out.println("Hello from class A");
    }
}

public class anonymousinnerclass {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("Hello from anonymous inner class");
            }
        };
        obj.show();
    }
}