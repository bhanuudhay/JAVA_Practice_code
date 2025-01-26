class Calcu {
    public int sum(int a, int b) {
        return a + b;
    }
}

@Overide
class AdvCalcu extends Calcu {
    public int sum(int a, int b) {
        return a + b + 1;
    }
}

public class overiding {
    public static void main(String args[]) {
        AdvCalcu obj = new AdvCalcu();
        int r = obj.sum(3, 4); // output is 8
        System.out.println(r);
    }
}