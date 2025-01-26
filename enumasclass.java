enum Laptop {
    Macbook(3000), HP(4000), Dell(), Lenovo(3000);

    private int values;

    private Laptop(int values) {
        this.values = values;
    }

    private Laptop() {
        this.values = 0;
    }

    public int getValues() {
        return values;
    }

    public void setValues(int values) {
        this.values = values;
    }

}

public class enumasclass {
    public static void main(String[] args) {
        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + "   " + lap.getValues());
        }
    }
}