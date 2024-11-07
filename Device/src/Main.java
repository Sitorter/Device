interface Device {
    void turnOn();
    void turnOff();
    default void charge(){
        System.out.println("Charging ...");
    }
    static String reset(){
        return "Reset";
    }
}
class Smartphone implements Device {
    public void turnOn(){
        System.out.println("Turning on Smartphone");
    }
    public void turnOff(){
        System.out.println("Turning off Smartphone");
    }
}
class Laptop implements Device {
    public void turnOn(){
        System.out.println("Turning on Laptop");
    }
    public void turnOff(){
        System.out.println("Turning off Laptop");
    }

}
public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        Laptop laptop = new Laptop();
        smartphone.turnOn();
        smartphone.turnOff();
        smartphone.charge();
        laptop.turnOn();
        laptop.turnOff();
        laptop.charge();
        System.out.println(Device.reset());
    }
}