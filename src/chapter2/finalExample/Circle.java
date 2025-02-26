package chapter2.finalExample;

public class Circle {
    //속성
    final static double PI =3.141539;
    final double radius;

    //생성자
    Circle(double radius) {
        this.radius=radius;
    }

    //기능
    Circle chagneRadius(double newRadius) {
        return new Circle(newRadius);
    }
}
