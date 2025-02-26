package chapter2.interitance.abstractExemple;
//추상클래스 선언
abstract class Animal {
    public String name;
    private String food="???";
    // 강제 추상
    abstract void sleep();{

    }

    public void eat(String food) {
        this.food = food;
        System.out.println(this.food+"먹고 잡니다");

    }

}


