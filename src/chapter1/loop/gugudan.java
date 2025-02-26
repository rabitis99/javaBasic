package chapter1.loop;
import java.util.Scanner;
public class gugudan {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 구구단 단수를 입력하세요 (2~9):");
        int num =scanner.nextInt();
        System.out.println("===="+num+"단 ====");
        System.out.println("-------------------------");
        for(int i=1;i<10;i++){
            System.out.println(num + " * " + i + " = "+ num*i);
        }
        for(int i=2;i<10;i++){
            System.out.println(i +"단");
            System.out.println("-------------------------");
            for (int j=1;j<10;j++){

                System.out.println(i + " * " + j + " = "+ j*i);
            }
        }
    }
}
