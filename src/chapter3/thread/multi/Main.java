package chapter3.thread.multi;

public class Main {
    public static void main(String[] args) {
        System.out.println(":::main 쓰레드 시작");

        MYThread thread0 = new MYThread();
        MYThread thread1 = new MYThread();

        //run이란 함수를 만들었지만 start로 시작해야됨..
        // 1. thread0 시작
        System.out.println("thread0 시작");
        thread0.start();
        // 1. thread1 시작
        System.out.println("thread0 시작");
        thread1.start();

        System.out.println(":::main 쓰레드 종료");
    }
}
