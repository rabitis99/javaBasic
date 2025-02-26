package chapter2.staticExemple;

public class Main {
    public static void main(String[] args) {
        // static 변수,메서드 활용
        System.out.println("static 변수 활용 = " + Person.population);
        Person.PrintPopulation();

        // 인스턴스 멤버 활용
        Person person = new Person();
        person.name ="Lim";
        person.PrintName();

        // static 활용
        Person.PrintPopulation();
    }
}
