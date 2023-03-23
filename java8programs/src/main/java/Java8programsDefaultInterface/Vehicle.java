package Java8programsDefaultInterface;

public interface Vehicle {
    public int getSpeed();
    public void applyBreak();

    public default void autoPilot() {
        System.out.println("I will help in driving without manual support");
    }

}
