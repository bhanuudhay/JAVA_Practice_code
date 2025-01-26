class Human
{
    private int age;
    private String name;

    public Human()     // default constructor  {costructor = same name as class name and dont need to specify any return type and special type of method and evem if we dont mention default constructor is there }
    {
        age = 11;
        name = "John";
    }

    public Human(int a , String n)  // parametirized constructor
    {
        name = n;
        age = a;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name  = name;
    }
     
     public String getName()
     {
        return name;
     }
}

public class constructor
{
    public static void main(String[] args)
    {
        Human obj = new Human();
        Human obj1 = new Human(44,"Bhanu");
        // obj.setAge(25);
        // obj.setName("John");
        System.out.println(obj.getAge() + " " + obj.getName());
        System.out.println(obj1.getAge() + " " + obj1.getName());
    }
}