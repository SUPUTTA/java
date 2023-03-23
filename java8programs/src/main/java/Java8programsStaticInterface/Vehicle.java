package Java8programsStaticInterface;

public interface Vehicle {

    public int getSpeed();
    public void applyBreak();
    public default void autoPilot(){
        System.out.println("I will help in driving without any manual support");
    }
    public static void sayHello(){
        System.out.println("Hi, this is my favourite car");
    }
}
