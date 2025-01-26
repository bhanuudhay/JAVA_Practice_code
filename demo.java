class Calculator
{
    int a ;
    public int add(int n1 ,int n2)
        {
            int res = n1+n2;
            return res;
        }
    
}

public class demo
{
    public static void main(String[] args) {

        Calculator c = new Calculator();
         int result = c.add(4,5);
         System.out.println(result);

}
}