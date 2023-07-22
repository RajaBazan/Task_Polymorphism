package hello.com;
abstract class Telephone{
   abstract void Ring();
    abstract void Lift();
    abstract void Disconnect();
}
interface Cell{
    void call();
    void message();
}
class Smartphone extends Telephone implements Cell{
    @Override
    void Ring() {
        System.out.println("Ringing...");
    }

    @Override
    void Lift() {
        System.out.println("Lifting...");
    }

    @Override
    void Disconnect() {
        System.out.println("Disconnecting...");
    }

    @Override
    public void call() {
        System.out.println("Calling...");
    }

    @Override
    public void message() {
        System.out.println("Messaging...");
    }
}
//          Task #2:
interface TvRemote{
        void LedRemote();
        void MonitorRemote();
}
interface ChildOfTvRemote extends TvRemote{
    void AcRemote();
    void CameraRemote();
}
class Remote implements ChildOfTvRemote{
    @Override
    public void LedRemote() {
        System.out.println("Led Remote...");
    }

    @Override
    public void MonitorRemote() {
        System.out.println("Monitor remote...");
    }

    @Override
    public void AcRemote() {
        System.out.println("Ac Remote...");
    }

    @Override
    public void CameraRemote() {
        System.out.println("Camera Remote..");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Telephone tel = new Smartphone();
        tel.Ring();
        tel.Lift();
        tel.Disconnect();
        Cell cel = new Smartphone();
        cel.call();
        cel.message();
        System.out.println("Here We are solving Task # 2");
        TvRemote tv = new Remote();
        tv.LedRemote();
        tv.MonitorRemote();
    }
}