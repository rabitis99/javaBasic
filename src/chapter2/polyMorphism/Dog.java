package chapter2.polyMorphism;

public class Dog implements Animal {


    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }

    @Override
    public void exit() {
        System.out.println("살아있습니다");

    }
    public void wag(){
        System.out.println("꼬리 흔들기");
    }
}
