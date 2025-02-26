package chapter2.interitance;

public class Main {
    public static void main(String[] args) {

        Child child = new Child();
        Parent parent = new Parent();
        System.out.println(child.honor); // ✅ 부모의 속성을 물려받아 사용
        System.out.println(child.familyName); // ✅ 부모의 속성을 물려받아 사용
        parent.introduceFamily(); // ✅ 부모의 메서드를 물려받아 사용
        child.superTest();
        child.introduceFamily();
    }
}

