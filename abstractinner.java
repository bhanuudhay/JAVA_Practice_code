abstract class A {
    public abstract void show();
}

public class abstractinner {
    public static void main(String args[]) {
        A obj = new A() { // in this object is created of anonymous inner class

            public void show() {
                System.out.println("In show");
            }

        };
        obj.show();
    }
}
