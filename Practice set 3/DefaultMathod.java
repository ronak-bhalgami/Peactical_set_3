//This program is done by Ronak Bhalgami(21CE009)
interface camara
{
    void TakeSnap();
    void ShootVideo();
    void OpenCamara();
    default void ShootIn4k()
    {
        System.out.println("Shooting in 4k...");
    }
}
class SmartPhone implements camara
{
    public void UnlockPhone()
    {
        System.out.println("Phone is opening");
    }
    public void OpenCamara()
    {
        System.out.println("Camara is opening");
    }
    public void TakeSnap()
    {
        System.out.println("Tacking snap");
    }
    public void ShootVideo()
    {
        System.out.println("Shooting video");
    }
    public void ShootIn4k()
    {
        System.out.println("4k rolling...");
    }
}
public class DefaultMathod {
    public static void main(String[] args) {
        SmartPhone S1=new SmartPhone();
        S1.UnlockPhone();
        S1.OpenCamara();
        S1.TakeSnap();
        S1.ShootVideo();
        S1.ShootIn4k();
    }
}
