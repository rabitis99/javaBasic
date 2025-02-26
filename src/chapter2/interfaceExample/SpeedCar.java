package chapter2.interfaceExample;

public class SpeedCar implements Car
{


    @Override
    public void move() {
        System.out.println("빠르게 운전합니다.");
    }

    @Override
    public void stop() {
        System.out.println(" 빠르게 운전합니다" );

    }
    void autoParking(){
        System.out.println("자동 주차가능 합니다");
    }

}

