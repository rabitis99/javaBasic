package chapter2.polyMorphism;

public class Cat implements Animal {
    @Override
    public void exit() {
        System.out.println("살아있습니다.");
    }


    @Override
    public void makeSound() {
        System.out.println("야옹");
    }

    public void scratch(){
        System.out.println("스크래치");
    }

}
