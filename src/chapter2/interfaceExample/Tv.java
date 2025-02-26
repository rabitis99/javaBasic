package chapter2.interfaceExample;

public class Tv implements Supplyment {
    @Override
    public void turnOn() {
        System.out.println("Tv is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv is turned off");
    }
}
