
// for just carrying data we need this much code , we can reduce the code in one line 
/*class A {
    private int id;
    private String name;

    public A(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}*/

// here we are using record instead of class and it automatically generate
// getters and setters for fields
// and also provide equals, hashCode, toString methods.

// public A(int id , String name)
// {
// this.id =id;
// this.name = name;
// }

// compact canonical constructor
record A(int id, String name) {
    // compact canonical constructor
    public A {
        if (id == 0) {
            throw new IllegalArgumentException("ID cannot be 0");
        }
    }
}

public class recoderclass {
    public static void main(String[] args) {
        A obj = new A(1, "Bhanu");
        A obj1 = new A(2, "Happy");
        System.out.println(obj.id() + " " + obj.name());
        System.out.println(obj1.id() + " " + obj1.name());
    }
}
