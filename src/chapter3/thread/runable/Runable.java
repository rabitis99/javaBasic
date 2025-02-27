package chapter3.thread.runable;

public class Runable extends MyNewClass implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("현재 시작된 쓰레드 = " + threadName);
        for (int i = 0; i < 10; i++) {
            System.out.println("현재 쓰레드: " + threadName + " - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("종료 쓰레드 :"+threadName);



    }
}
