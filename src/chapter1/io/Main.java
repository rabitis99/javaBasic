package chapter1.io;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //println
        System.out.println("Hello");
        System.out.println("java");

        //print
        System.out.print("안녕");
        System.out.print("자바");

        //개행문자 포함 츌력
        System.out.print("안녕\n자바");

        //입력
        Scanner scanner = new Scanner(System.in);

        //문자열 입력받기
        System.out.print(" 좋아하는 문장을 입력하세요: ");
        String setence =scanner.nextLine();
        System.out.println("setence = " + setence);
        
        //정수형(int, long) 입력받기
        System.out.print(" 정수(int)를 입력하세요");
        int intBox= scanner.nextInt();
        System.out.println("intBox = " + intBox);

        System.out.print(" 정수(long)를 입력하세요");
        long longBox= scanner.nextLong();
        System.out.println("longBox = " + longBox);

        System.out.print(" 소수를 입력하세요");
        double doubleBox= scanner.nextDouble();
        System.out.println("doubleBox = " + doubleBox);

    }
}
