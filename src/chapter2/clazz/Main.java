package chapter2.clazz;

public class Main {
    public static void main(String[] args) {
        //객체 생성(인스턴스화)
        Person personA = new Person("Lim",27);
        Person personB = new Person("Alex",20);
        Car carA=new Car("K5");
        Car carB=new Car("K6");
        carA.accelerate(150);
        System.out.println("carA.acceleration = " + carA.acceleration+"km/h");
        System.out.println("carB.acceleration = " + carB.acceleration+"km/h");
        //속성에 직접 접근
//        System.out.println("personA = " + personA.name);
//        System.out.println("personB = " + personB.name);
//        personA.name="Lim";
//        personB.name="Alex";
//        System.out.println("personA = " + personA.name);
//        System.out.println("personB = " + personB.name);
        System.out.println("personA.sum(1) = " + personA.sum(2));
        System.out.println("personB.sum(1) = " + personB.sum(1));
        //게터활용
        String name = personA.getName();
        System.out.println("name = " + name);
        //세터활용
        personA.setAddress("AnSan");
        System.out.println("personA.address = " + personA.address);

    }

}

