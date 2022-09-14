//This program is done by Ronak Bhalgami(21CE009)
interface P
{
    int P=1;
    void P();
}
interface P1 extends P
{
    int P1=2;
    void P1();
}
interface P2 extends P
{
    int P2=3;
    void P2();
}
interface P12 extends P1,P2
{
    int P12=4;
    void P12();
}
class All implements P12
{
    public void P()
    {
        System.out.println("P called");
    }
    public void P1()
    {
        System.out.println("P1 called");
    }
    public void P2()
    {
        System.out.println("P2 called");
    }
    public void P12()
    {
        System.out.println("P12 called");
    }
}
public class InterfaceInheritance {
    public static void main(String[] args) {
        All a1=new All();
        System.out.println("+++Interface P+++");
        System.out.println(a1.P);
        a1.P();
        System.out.println();
        System.out.println("+++Interface P1+++");
        System.out.println(a1.P1);
        a1.P1();
        System.out.println();
        System.out.println("+++Interface P2+++");
        System.out.println(a1.P2);
        a1.P2();
        System.out.println();
        System.out.println("+++Interface P12+++");
        System.out.println(a1.P12);
        a1.P12();
    }
}
