public class Staticmethoddemo
{
    static int age; // static variable
    static void show()  // static method
    {
        System.out.println("Print static method");

    }
    public static void main(String[] args)
    {
        age = 40;
        System.out.println("Age is :" + age);

         show(); // accessing the static method
    }
}
