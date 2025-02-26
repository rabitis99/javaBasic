package chapter2.capsulation;

public class Person {
    //속성
    public String name;
    private int age;

    //생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //기능
    int getAge() {
        return this.age;
    }
    void setAge(int age) {
        this.age = age;
    }
}
