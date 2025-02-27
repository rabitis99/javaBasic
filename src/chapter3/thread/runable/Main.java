package chapter3.thread.runable;

public class Main {
    public static void main(String[] args) {
        Runable Mytasl = new Runable();

        //기능 활용해서 사용
        Mytasl.printMessage();

        Thread thread0 = new Thread(Mytasl);
        Thread thread1 = new Thread(Mytasl);

        thread0.start();
        thread1.start();

    }
}
