package chapter1.oprerator;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b= 3;
        //기본적인 사칙연사
        int sum = a+b;
        System.out.println("sum = " + sum);

        int sub= a-b;
        System.out.println("sub = " + sub);

        int mul= a*b;
        System.out.println("mul = " + mul);

        double b2 = 3.0;
        double div= a/b2;
        System.out.println("div = " + div);

        int mod =10%3;
        System.out.println("mod = " + mod);

        //시간 연산
        int mod1= (10+5)%12;
        System.out.println("mod1 = " + mod1);

        //짝수 홀수 연산
        int mod2= 5%2;
        System.out.println("mod2 = " + mod2);

        int mod3= 6%2;
        System.out.println("mod3 = " + mod3);

        //대입 연산자
        int num= 5;

        //복합 대입 연사자
        num +=3 ;// num = num + 3;
        System.out.println("num = " + num);

        num -=2;
        System.out.println("num = " + num);

        num *= 2;
        System.out.println("num = " + num);

        num /= 2;
        System.out.println("num = " + num);

        num %= 3;
        System.out.println("num = " + num);

        //증감연산자
        num = 1;

        System.out.println("num: " + num);  // 1
        num++;  // 값을 1 증가 시킴 num = num + 1;
        System.out.println("num++ = " + num);  // 2

        num--;  // 값을 1감소시킴 num = num - 1;
        System.out.println("num-- =" + num);  // 1

        //전위 연산(++i)
        int intBox=5;
        System.out.println("++intBox = " + (++intBox));

        //후위 연산(i--)
        int intBox2=5;
        System.out.println("intBox2++ = " + (intBox2++));
        System.out.println("intBox2 = " + intBox2);
        // 같음 연산
        System.out.println("10 == 10:" + (10==10));

        // 다름 연산
        System.out.println("10 != 5:" + (10!=5));

        // 크기비교연산
        System.out.println("10 < 5:" + (10<5));
        System.out.println("10 >= 10:" + (10>=10));
        System.out.println("10 <= 10:" + (10==5));

        // 논리연산자
        // AND 연산(&&)- 두 조건이 모두 참일때 true 반환
        System.out.println("true & true:" + (true && true));
        // OR 연산(||)- 두 조건이 하나라도 참일때 true 반환
        System.out.println("false & false:" + (false ||false));
        //NOT 연산자(!) - true -> false  false -> true
        System.out.println("!false:" + (!false));

        //연산자 우선순위
        boolean flag = (10 + 5) > 12 && true;
        System.out.println(flag);
        // 실행 순서: (10 + 5) > 12 && true : 산술
        // → 15 > 12 && true : 비교
        // → true && true : 논리
        // → flag = true 대입

        //논리 연산자 우선순위(! ->&& ->||)
        boolean result = true ||(false&&false);
        System.out.println(result);

        boolean result2 = ((true ||false)&& !false);
        System.out.println(result2);

        //문자열 비교
        String text = "Hello";
        String text2 = "Hello";
        System.out.println("isEqual =" + text.equals(text2));
        System.out.println(text==text2);

    }
}
