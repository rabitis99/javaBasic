package chapter2.interitance;

import chapter2.interfaceExample.Car;

public class Child extends Parent {

    public String familyName ="gygim";

    public Child() {
        super();
        System.out.println("자식생성자");
    }
    public void superTest(){
        System.out.println("super.familyName = " + super.familyName);
    }
    public void showSocialMedia(){
        System.out.println("sns에서 우리가문을 소개합니다.");
    }
    @Override
    public void introduceFamily() {
        System.out.println("우리 " + this.familyName + " 신세대다");
    }
}
