package chapter3.lamda;

public class Main {

    public static int calculate(int a, int b, Calculator calculator) {
        return calculator.sum(a, b);
    }
    public static void main(String[] args) {
        //인터페이스를 활용한 익명클래스 만들기
        Calculator calculator = new Calculator() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        int ret1=calculator.sum(1, 2);
        System.out.println("ret1 = " + ret1);

        //인터페이스 활용한 람다식 만들기
        Calculator calculator2 = (a,b)->a+b;
        int ret2=calculator2.sum(1, 2);
        System.out.println("ret2 = " + ret2);
        
        //람다식을 매개변수로 전달하는 방법:
        //1 익명클래스를 변수에 담아 매개변수로 전달
        Calculator cal1=new Calculator() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };
        int ret3=cal1.sum(1, 2);
        System.out.println("ret3 = " + ret3);

        //2. 람다식을 변수에 담아 매개변수로 전달
        Calculator cal2 =(a,b)->a+b;
        int ret4=cal2.sum(1, 2);
        System.out.println("ret4 = " + ret4);
        //3.람다식을 직접 매개변수로 전달
        int ret5=calculate(1, 2,(a,b)->a +b);
        System.out.println("ret5 = " + ret5);

    }
}
