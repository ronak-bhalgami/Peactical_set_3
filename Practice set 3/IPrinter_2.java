//This program is done by Ronak Bhalgami(21CE009)
import java.util.*;

interface IScanner {
    String name = "Ronak";

    void scanner();
}

interface IPrinter {

    default void IPrinterMethod()
    {
        System.out.println("Default method...");
    }
    void printer();
}

class PC implements IPrinter, IScanner {
    Scanner sc = new Scanner(System.in);
    String name;

    public void scanner() {
        System.out.print("Enter your name : ");
        name = sc.next();
    }
    public void printer() {
        System.out.println("Your name is " + name);
    }
}

public class IPrinter_2 {

    public static void main(String[] args) {
        Vector v = new Vector();

        PC p1=new PC();
        PC p2=new PC();
        PC p3=new PC();
        PC p4=new PC();
        PC p5=new PC();

        p1.scanner();
        p2.scanner();
        p3.scanner();
        p4.scanner();
        p5.scanner();
        
        v.add(p1);
        v.add(p2);
        v.add(p3);
        v.add(p4);
        v.add(p5);

        PC x1= (PC) v.get(0);
        PC x2= (PC) v.get(1);
        PC x3= (PC) v.get(2);
        PC x4= (PC) v.get(3);
        PC x5= (PC) v.get(4);
        
        x1.printer();
        x2.printer();
        x3.printer();
        x4.printer();
        x5.printer();

    }
}
