class Emp
{
    int Empid;// non-static
    int salary;
    static String ceo; // static

    public void show()
    {
        System.out.println(Empid +" "+ salary +" "+ ceo);
    }
}
public class Staticclassdemo
{
    public static void main(String[] args)
    {
        Emp Hari = new Emp();  //creating object
        Hari.Empid = 1234;
        Hari.salary= 50000;
        Emp.ceo = "Haran";

        Emp Vignesh = new Emp();
        Vignesh.Empid = 5452;
        Vignesh.salary= 40000;
        Emp.ceo= "Haran";

        Hari.show();
        Vignesh.show();


    }
}
