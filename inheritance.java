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
// this is single level inheritance  in which there is one parent class and one child class
public class inheritance
{
    public static void main(String args[])
    {
        AdvCalc ac = new AdvCalc();
        int r1 = ac.add(3,4);
        int r2 = ac.sub(9,4);
        int r3 = ac.mul(3,4);
        int r4 = ac.div(8,4);

        System.out.println(r1 + " " + r2 + " " + r3 +" " +r4);

    }
}