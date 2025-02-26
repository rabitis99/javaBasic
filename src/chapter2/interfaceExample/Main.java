package chapter2.interfaceExample;

public class Main {
    public static void main(String[] args) {
        SpeedCar speedCar = new SpeedCar();
        LuxuryCar luxuryCar = new LuxuryCar();
        //인터페이스 활용
        speedCar.move();
        luxuryCar.move();
        speedCar.stop();
        luxuryCar.stop();
        luxuryCar.chargeBattey();
        speedCar.autoParking();
        //과제
        AriContioner aricontioner = new AriContioner();
        Computer computer = new Computer();
        Tv tv = new Tv();
        aricontioner.turnOff();
        computer.turnOff();
        tv.turnOff();
        tv.turnOn();
        aricontioner.turnOn();
        computer.turnOn();
    }
}
