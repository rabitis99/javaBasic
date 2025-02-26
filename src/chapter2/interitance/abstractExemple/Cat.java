package chapter2.interitance.abstractExemple;

public class Cat extends Animal {
    //abstract 강제 상속
    @Override
    void sleep() {
        System.out.println("냐옹냐옹");
    }


}
