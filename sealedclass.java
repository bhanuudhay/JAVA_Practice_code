// Sealed class A permits only B and C to extend it
sealed class A permits B, C {
    // Only allow some classes to extend, not all
}

// Final class B extends A, cannot be further extended
final class B extends A {
    // Subclasses have to be sealed or non-sealed or final
}

// Non-sealed class C extends A, can be further extended
non-sealed class C extends A {
    // Can be extended by other classes
}

// Class D cannot extend A because it's not permitted
// class D extends A { // Error: A is sealed and does not permit D

// Sealed interface X permits only Y to implement it
sealed interface X permits Y {
    // Only allow some interfaces to implement, not all
}

// Sealed interface Y extends X, cannot be further implemented
non-sealed interface Y extends X {
    // Implementations have to be sealed or non-sealed or final
}

public class sealedclass {
    public static void main(String[] args) {
        // Main method
    }
}