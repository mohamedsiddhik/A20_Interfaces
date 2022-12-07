interface  AI{
    void onML();
}
interface controllable{
    void onLeft();
    void onRight();
    void onAbove();
    void onBelow();
}
class Robot implements controllable,AI{

    @Override
    public void onLeft() {
        System.out.println("Robot Turns Left");
    }

    @Override
    public void onRight() {
        System.out.println("Robot Turns Right");
    }

    @Override
    public void onAbove() {
        System.out.println("Robot Turns above");
    }

    @Override
    public void onBelow() {
        System.out.println("Robot Turns Below");
    }

    @Override
    public void onML() {

    }
}

class AIRobot extends Robot{

}



public class Interface3{
    public static void main(String[] args) {
        AIRobot ar = new AIRobot();
        ar.onML();
        ar.onAbove();
        ar.onBelow();
        ar.onLeft();
        ar.onRight();
    }
}