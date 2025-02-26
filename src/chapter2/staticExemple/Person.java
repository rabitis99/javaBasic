package chapter2.staticExemple;

public class Person {

    // 인스턴스 변수
    String name;

    //static 변수
    static int population=10;

    Person() {
        population++;
    }
    //인스턴스 매서드
    void PrintName(){
        System.out.println("name = " + name);
    }

    //static 매서드
    static void PrintPopulation(){
        System.out.println("전체 인구 수 = " + population);
    }
}
