class Staticblockdemo
{
    static int a =50;
    static int b;
    static int result;

    static {
        System.out.println("Static block 1.");

        b=a*5;
    }
    static {
        System.out.println("static block 2.");
        result=20;
    }

    static void show()
    {
        System.out.println("a= "+a);
        System.out.println("b = "+b);
        System.out.println("result= "+result);
    }
    public static void main(String[] args)
    {
        show();
    }

}




