

package interfaces;

interface Flyable{
    void fly();
}
class Sparrow implements Flyable{

    @Override
    public void fly() {
        System.out.println("Sparrow flying a speed of 10 KMPH");
    }
}
class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("Aeroplane flying a Speed is 2000 KMPH");
    }
}
public class Example1
{
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        Plane plane = new Plane();
        plane.fly();
    }
}
