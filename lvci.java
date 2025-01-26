// Define a new class named 'a'
class a {
    // This class is currently empty, but you can add properties and methods here
}

// Define a new public class named 'lvci'
public class lvci {
    // var s= 2; throw error ca use outside used only in local class
    // LOCAL VARIABLE CLASS INTERFERENCE
    // This is the main method where the program starts execution
    public static void main(String args[]) {
        // Declare an integer variable 'y' and assign it the value 5
        int y = 5;

        var x = 4; // at compiler time set the type

        // Declare a String variable 'var' and assign it the value "bhanu"
        // Note that 'var' is a reserved keyword in Java, but it can also be used as a
        // variable name
        String var = "bhanu"; // can be used as variable name

        // Declare a variable 'b' using the 'var' keyword and assign it a new instance
        // of class 'a'
        // The type of 'b' is inferred to be 'a' because it's assigned an instance of
        // class 'a'
        var b = new a(); // also used to instancized the class
    }
}