package chapter2.interfaceExample;

public class LuxuryCar implements Car {
    @Override
    public void move() {
        System.out.println("멋지게 운전합니다.");
    }

    @Override
    public void stop() {
        System.out.println("멋지게 멈춥니다");

    }
    void chargeBattey(){
        System.out.println("충전이 가능합니다");
    }
}
