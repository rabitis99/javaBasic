package chapter2.finalExample;

public class Main {

    public static void main(String[] args) {
        final int a= 10;
        //a=30 X
        System.out.println("a = " + a);
        System.out.println("pi = " + Circle.PI);

        final Circle circle = new Circle(2);
        //참조 변경을 막지만 내부변경은 막지 못합니다. -> radius도 final
        //circle= new Circle(3);
        //불변 객체의 내부상태가 변경이 필요한 경우
        Circle circle2= new Circle(10);//생성자
        circle2.chagneRadius(20);//기능을 활용
    }

}
