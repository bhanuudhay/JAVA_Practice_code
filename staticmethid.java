// File: Mobile.java
class Mobile {
    String brand;
    int price;
    static String name;

    // Instance method to display details
    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    // Static method to display details of a Mobile object
    public static void show1(Mobile obj) {
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

// File: Demo.java
public class staticmethid {
    public static void main(String[] args) {
        // Creating first Mobile object
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1000;
        Mobile.name = "phone";

        // Creating second Mobile object
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 2000;
        Mobile.name = "cellphone";

        // Changing the static name variable
        Mobile.name = "smartphone";

        // Displaying details of obj1
        obj1.show();
        obj2.show();

    }
}
