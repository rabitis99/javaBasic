package chapter2.interfaceExample;

public class AriContioner implements Supplyment{
    @Override
    public void turnOn() {
        System.out.println("Computer is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Computer is turned off"   );
    }
}
