package Java8programsStaticInterface;

public class Honda implements Vehicle {

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.getSpeed();
        honda.applyBreak();
        honda.autoPilot();
        Vehicle.sayHello();
        Honda.sayHello();
    }

    private static void sayHello() {
        System.out.println("Hi, This is your favourite honda car");
    }

    //we can write default methods inside interfaces, and we can also write static methods inside them to define any utility functionality
    //static methods don't belong to a particular object,
    // they are not available to the classes implementing interface, and they have to be called by using interface name preceeding the method name
    //interface static methods by default not applicable to the implementation class,
    // we can define same method in the implementation class, it's valid but not overriding.
    @Override
    public int getSpeed() {
        return 100;
    }

    @Override
    public void applyBreak() {
        System.out.println("Breaks Applied");

    }

    @Override
    public void autoPilot() {
        System.out.println("Honda auto pilot applied");
    }


}
