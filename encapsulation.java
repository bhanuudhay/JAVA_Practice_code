class Human
{
    private int age ;
    private String name ;

    public void setAge(int a )  //setter 
    {
        age = a;
    }

    public void setName(String b)
    {
        name = b;
    }

    public int getAge()    //getter
        { 
            return age;
        }
    public String getName()
    {
        return name;
    }

}
public class encapsulation{
    public static void main(String a[]) {

        Human obj = new Human();
        obj.setAge(23);
        obj.setName("Johnii");
        System.out.println(obj.getName() +" : " + obj.getAge());
    }
}