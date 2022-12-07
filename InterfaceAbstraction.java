
interface  animal{
    void sound();
    void eat();
    void sleep();
}
class Dog implements animal{

    @Override
    public void sound() {
        System.out.println("Dog sound is : Woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog is Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is Sleeping");
    }
}




public class InterfaceAbstraction
{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.eat();
        d.sleep();
    }
}