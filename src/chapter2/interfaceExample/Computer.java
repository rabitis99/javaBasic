package chapter2.interfaceExample;

public class Computer implements Supplyment {

    @Override
    public void turnOn() {
        System.out.println("Computer is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Computer is turned off");
    }
}
