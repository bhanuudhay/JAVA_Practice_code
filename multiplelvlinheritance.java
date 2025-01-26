class Calc
{
    public int add(int a , int b)
    {
        return a+b;
    }
    public int sub(int a , int b)
    {
        return a-b;
    }
}
class AdvCalc extends Calc{
    public int mul(int a , int b)
    {
        return a*b;
    }
    public int div(int a, int b)
    {
        return a/b;
    }
}
class VeryAdvCalc extends AdvCalc
{
    public double pow(int a , int b)
    {
        return Math.pow( a, b);
    }
}


public class multiplelvlinheritance
{
    public static void main(String args[])
    {
        VeryAdvCalc ac = new VeryAdvCalc();
        int r1 = ac.add(3,4);
        int r2 = ac.sub(9,4);
        int r3 = ac.mul(3,4);
        int r4 = ac.div(8,4);
        double r5 = ac.pow(4,2);

        System.out.println(r1 + " " + r2 + " " + r3 +" " +r4+" " + (int)r5);

    }
}