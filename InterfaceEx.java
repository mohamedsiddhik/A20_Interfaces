
interface interDemo{
    int a = 25;
    void fun1();
    public static void fun2(){
        System.out.println("i am fun 2");
    }
    default void fun5(){
        System.out.println(" i am fun 5");
    }

}

interface interDemo2 extends interDemo{
    void fun4();
}
class TestInter implements  interDemo,interDemo2{

    @Override
    public void fun1() {
        System.out.println("Fun - 1");
    }

    @Override
    public void fun4() {
        System.out.println("Fun - 4");
    }

}

public  class InterfaceEx
{
    public static void main(String[] args) {

        System.out.println("A : " + interDemo.a);
        interDemo.fun2();
    }
}