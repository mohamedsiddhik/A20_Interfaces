
class Phone{
    void call(){
        System.out.println("make a call");
    }
    void  sms(){
        System.out.println("make a sms");
    }
}
interface camera{
    void snap();
    void record();
}
interface musicPlayer{
    void play();
    void pause();
    void stop();
}
class SmartPhone extends  Phone implements camera,musicPlayer{

    @Override
    public void snap() {
        System.out.println("Take a Selfie");
    }

    @Override
    public void record() {
        System.out.println("Take a Video call");
    }

    @Override
    public void play() {
        System.out.println("Play Music");
    }

    @Override
    public void pause() {
        System.out.println("Pause  Music");
    }

    @Override
    public void stop() {
        System.out.println("Stop Music");
    }
}



public class Interface2
{
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone();
        s1.call();
        s1.sms();
        s1.snap();
        s1.record();
        s1.play();
        s1.pause();
        s1.stop();
    }
}