/* 
class -> class = extends
class -> interface = implements
inteface -> interface = extends
*/
interface A {
    void show(); // in interface all the method are public abstract by default

    void config();

    int a = 3; // variable are final and static ie(use directly )
}

interface Y extends A { // like class we can also extend interface
    void run();
}

class B implements Y // if we don't implement all the method of the interface then the class will
                     // become abstract
{
    public void show() {
        System.out.println("showing ....");
    }

    public void config() {
        System.out.println("config .....");
    }

    public void run() {
        System.out.println("running");
    }
}

public class interfacee {
    public static void main(String args[]) {
        A obj;
        obj = new B(); // object of B class is created and assigned to A reference variable
        obj.show();
        obj.config();
        /// obj.run(); // it will throw error because A reference is there and A dont
        /// know about run so we reassign the reference
        Y obj1 = new B();
        obj1.run();

    }

}
