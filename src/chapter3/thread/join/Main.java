package chapter3.thread.join;

import chapter3.thread.multi.MYThread;

public class Main {
    public static void main(String[] args) {
        System.out.println(":::main 쓰레드 시작");

        MYThread thread0 = new MYThread();
        MYThread thread1 = new MYThread();

        long startTime = System.currentTimeMillis();

        // 1. thread0 시작
        System.out.println("thread0 시작");
        thread0.start();

        // 2. thread1 시작
        System.out.println("thread0 시작");
        thread1.start();

        //쓰레드 대기 시키기
        try {
            thread1.join();
            thread0.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("총 걸린 시간  " + totalTime+"ms");
        System.out.println(":::main 쓰레드 종료");
    }
}
