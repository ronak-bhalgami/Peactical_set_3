import mypack.Mypackage;

 
public class CustomPackageMain {
  public static void main(String[] args) {
    Mypackage M1=new Mypackage();
    System.out.println(M1.sum(1, 2));
    System.out.println(M1.sub(1, 2));
    System.out.println(M1.mul(1, 2));
    System.out.println(M1.div(1, 2));
  }
}
