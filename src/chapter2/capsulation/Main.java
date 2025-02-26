package chapter2.capsulation;

public class Main {
    public static void main(String[] args) {
        //생성자 호출
        Person person = new Person("John Doe", 20);

        //게터
        int age=person.getAge();
        System.out.println("age = " + age);

        //세터
        person.setAge(24);
        age=person.getAge();
        System.out.println("age = " + age);
    }
}
