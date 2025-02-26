package chapter3.generic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1. 재사용 불가
        Box box1 = new Box(5);
//        new Box("ABC");
//        new Box(0.1);
        //2. 낮은 타입 안정성
        ObjectBox strBox = new ObjectBox("ABC");
        ObjectBox intBox = new ObjectBox(5);

        String item =(String) strBox.getItem();
        System.out.println("item = " + item);

//        String item2 = (String) intBox.getItem();
//        System.out.println("item2 = " + item2);

        //제너릭의 활용
        GenericBox<String> strGBox = new GenericBox<>("ABC");
        GenericBox<Integer> intGBox = new GenericBox<>(100);
        GenericBox<Double> doubleGBox = new GenericBox<>(0.1);

        String strGBoxItem = strGBox.getItem();
        System.out.println("strGBoxItem = " + strGBoxItem);

        Integer intGBoxItem = intGBox.getItem();
        System.out.println("intGBoxItem = " + intGBoxItem);

        Double doubleGBoxItem = doubleGBox.getItem();
        System.out.println("doubleGBoxItem = " + doubleGBoxItem);

        //일반메서드
        strGBox.printItem("item");
        //제너릭메서드
        strGBox.printBoxItem(100);
        //계산기?
        Scanner scanner = new Scanner(System.in);
        strGBox.printBoxItem(scanner.nextLine());

    }
}
