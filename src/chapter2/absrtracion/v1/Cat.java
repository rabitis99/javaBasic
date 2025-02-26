package chapter2.absrtracion.v1;

public class Cat implements Animal{


    @Override
    public void makeSound() {
        System.out.println("냐옹");
    }

    @Override
    public void exit() {
        System.out.println("살아있다옹");
    }
    void scratch(){
        System.out.println("긁기다옹");
    }
}
