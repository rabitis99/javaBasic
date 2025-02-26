package chapter1.oprerator;
import java.util.Scanner;
public class OperatorMain {
    public static void main(String[] args){
        int a=15,b=4;

        int sum= a+b;
        System.out.println("덧셈 결과: " + sum);
        int sub=a-b;
        System.out.println("뺄셈 결과: " + sub);
        int mul=a*b;
        System.out.println("곱셈 결과: " + mul);
        int div=a/b;
        System.out.println("나눗셈 결과: " + div);
        int mod=a%b;
        System.out.println("나머지 결과 : " + mod);

        int x=10,y=20;
        System.out.println("x가 y보다 큰 가?"+(x>y));
        System.out.println("x가 y보다 작은 가?"+(x<y));
        System.out.println("x가 y보다 같은 가?"+(x==y));
        System.out.println("x가 y보다 다른 가?"+(x!=y));

         Scanner scanner=new Scanner(System.in);
        System.out.print("첫 번째 문자열을 입력하세요 :");
        String firstString= scanner.nextLine();
        System.out.print("두 번째 문자열을 입력하세요 :");
        String secondString= scanner.nextLine();
        System.out.println("두 문자열이 같은가요?"+firstString.equals(secondString));
    }
}
