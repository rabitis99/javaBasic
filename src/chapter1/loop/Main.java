package chapter1.loop;

public class Main {
    public static void main(String[] args) {
        //for 문 10번 반복
        for (int i=1; i<6; i++){
            if (i==2){
                continue;
            }
            if(i==4){
                break;
            }
            System.out.println(i + "번째 손님");
        }
        //while문
        int b=1;
        while (b<=10){
            System.out.println(b +"번째 안녕");
            b++;
        }
        //do-while문
        int c=1;
        do {
            System.out.println(c+"번째 안녕");
            c++;
        }while (c<=10);
    }
}
