package chapter2.wrapper;

import chapter2.clazz.Person;

public class Main {

    public static void main(String[] args) {
        //기본형 변수
        int a =1;
        System.out.println("a = " + a);
        //참조형 변수 :주소값
        Person personA =new Person("A",1);
        System.out.println("personA = " + personA);
        int[] intArr={1,2,3};
        System.out.println("intArr = " + intArr);
        //래퍼클래스(기본형 변수를 감싸고 있는 클래스)
        Integer b= 100;
        System.out.println("b = " + b);
        String numStr=Integer.toString(b);
        System.out.println("numStr = " + numStr);

        //직접 만든 래퍼클래스
        Custom custom1 =new Custom(10);
        String myInterger=custom1.toString();
        System.out.println("myInterger = " + myInterger);
        DoubleCustom custom2 =new DoubleCustom(1.3232);
        String myDouble=custom2.toString();
        System.out.println("myDouble = " + myDouble);
        //오토박싱(기본형 -> 참조형)
        Integer num3 = 10;
        //Interger num3 =Interger.valueof(3)
        int num4 = num3;
        // int num4= num.intValue();

    }
}
