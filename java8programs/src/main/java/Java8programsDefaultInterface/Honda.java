package Java8programsDefaultInterface;

public class Honda implements Vehicle {

    //can interface has concrete methods has which has a business logic ?
   // answer: yes through default methods
    @Override
    public int getSpeed() {
        return 0;
    }
    @Override
    public void applyBreak() {
        System.out.println("Breaks Applied");
    }
    @Override
    public void autoPilot() {
        System.out.println("Honda auto pilot applied");
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.applyBreak();
        honda.autoPilot();
        Honda.sayHello();
    }
    public static void sayHello() {
        System.out.println("This is your favourite honda car");
    }


}
