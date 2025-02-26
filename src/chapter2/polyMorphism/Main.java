package chapter2.polyMorphism;

public class Main {
    public static void main(String[] args) {
        //다향성 활용
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.makeSound();
        animal2.makeSound();

        animal1.exit();
        animal2.exit();
        //업캐스팅 주의사항
        //animal1.scratch();
        //animal2.wag();
        Cat cat = (Cat) animal1;
        cat.scratch();

        Dog dog = (Dog) animal2;
        dog.wag();

        //잘못된 다운캐스팅 문제
//        Cat cat2= (Cat) animal2;
//        cat2.scratch();
        //다운캐스팅시 instanceof 활용 방법
        if (animal1 instanceof Cat) {
            Cat cat2 = (Cat) animal1;
            cat2.scratch();
        }
        else {
            System.out.println("객체가 고양이가 아닙니다");
        }
        //
        Animal[] animals ={new Cat(),new Dog(),new Cat()};
        for(Animal animal : animals){
            animal.makeSound();
        }
    }


}
