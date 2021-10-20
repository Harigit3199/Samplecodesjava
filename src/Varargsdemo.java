class icalc
{
    public int add(int ... n)
    {
        int sum=0;
        for(int i:n) // foreach loop
        {
            sum=sum + i;
        }
        return sum;
    }
}
public class Varargsdemo
{
    public static void main(String[] args)
    {
        icalc obj = new icalc();
        System.out.println(obj.add(5,3,4,0,78,14,6,56,5,87));
    }
}
