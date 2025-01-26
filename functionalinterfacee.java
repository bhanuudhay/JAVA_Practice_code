@functionalinterface
interface a {
    void show(int i);
}

public class functionalinterfacee {
    public static void main(String[] a) {
        // we can also pass argument
        a obj = (i) -> /*
                        * if having argument then i ->
                        * System.out.println("this is a functional interface");
                        * = new a()
                        * {
                        * public void show()
                        * {
                        * System.out.println("this is a functional interface");
                        * }
                        * }
                        */
        System.out.println("this is a functional interface");
        obj.show(5); // -> is called lemda function that reduce the syntax
    }
}
