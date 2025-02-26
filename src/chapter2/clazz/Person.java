package chapter2.clazz;

public class Person {
    //1.속성 -변수 선언으로 표현
    String name;
    int age;
    String address;
    // 생성자 = 조립설명서
    //1.클래스와 이름이 동일
    //2.반환 타입이 존재X
    //3.여러개가 존재가능
    //4. 기본
    public Person(String name, int age){
        //this.name ->객체자신을 가리키는 키워드, name->매개변수
        this.name=name;
        this.age=age;
        System.out.println("Person name = " + name);
    }
    //3. 기능 메서드 부분
    int sum(int b){
        int result= this.age+b;
        return result;
    }
    //게터 속성 값을 가져오는 기능
    String getName(){
        return this.name;
    }
    //세터 속정 값을 설정해주는 기능
    void setAddress(String address){
        this.address=address;
    }
}
