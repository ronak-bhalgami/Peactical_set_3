//This programmis done by Ronak Bhalgami(21CE009)
class parent
{
    public void sum(int a, int b)
    {
        System.out.println("From parent..."+(a+b));
    }
    public void mul(int a,int b)
    {
        System.out.println("From parent..."+(a*b));
    }
}
class child extends parent
{
    public void sum(int a,int b)
    {
        System.out.println("From child..."+(a+b));
    }
    public void mul(int a, int b)
    {
        System.out.println("From child..."+(a*b));
    }
}
public class MehodOverloading {
    public static void main(String[] args) {
        child c1= new child();
        c1.sum(10, 2);
        c1.mul(10, 2);
        parent p1 = new parent();
        p1.sum(10, 2);
        p1.mul(10, 2);
        parent p2=new child();
        p2.sum(10, 2);
        p2.mul(10, 2);
    }
}
