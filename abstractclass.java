abstract class Car {
    /*
     * public void drive() {
     * // here we dont how the car drive so we can use abstract class if we dont
     * know
     * }
     */
    public abstract void drive(); // for using abstract method we have to make class abstract also

    public void music() {
        System.out.println("Car makes music");
    }
}

class Toyota extends Car { // concrete class
    public void drive() {
        System.out.println("Toyota is driving");
    }

    public void newFeature() {
        System.out.println("New feature of Toyota car");
    }
}

public class abstractclass {
    public static void main(String args[]) {
        // Car obj = new Car() ; // we can't create obj of abstract class car
        Car obj1 = new Toyota();
        obj1.drive();
        obj1.music();
    }

}
