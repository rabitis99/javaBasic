package chapter3.collection;

import chapter3.collection.example.Product;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //배열의 한계(정적)
        //선언과 동시에 길이를 설정 필요-> 길이 변경X

        //ArrayList 선언
        ArrayList<Integer> arrayList=new ArrayList<>();
        //ArrayList 값 추가
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        //한번에 입력과 선언
        //ArrayList<String> arrayList=new ArrayList<>(Arrays.asList());
        //ArrayList 사용
        ArrayList<String> names=new ArrayList<>();

        //데이터 추가
        names.add("James");
        names.add("Bob");
        //순서보장
        System.out.println("names = " + names);
        //중복 데이터 허용
        names.add("James");
        System.out.println("names = " + names);
        //데이터 단건 조회
        String name= names.get(0);
        System.out.println("name = " + name);
        //데이터 삭제
        names.remove("James");
        //names.remove(0);
        System.out.println("names = " + names);
    
        //HashSet 사용 방법
        HashSet<String> uniqueNames= new HashSet<>();
        uniqueNames.add("James");
        uniqueNames.add("Bob");
        uniqueNames.add("1");
        //순서 보장 X
        System.out.println("uniqueNames = " + uniqueNames);
        //get() 활용불가
        //uniqueNames.get()l

        //중복 데이터 불가
        uniqueNames.add("1");
        System.out.println("uniqueNames = " + uniqueNames);

        //데이터 제거
        uniqueNames.remove("1");
        System.out.println("uniqueNames = " + uniqueNames);

        //HashMap활용
        //<키,값> -> 저장
        HashMap<String,Integer> memberMap=new HashMap<>();
        memberMap.put("James",1);
        memberMap.put("Bob",2);
        memberMap.put("Isac",1);
        //순서보장 X
        System.out.println("memberMap = " + memberMap);

        //키 중복 불가 값이 덮어쓰기 발생
        memberMap.put("Isac",2);
        System.out.println("memberMap = " + memberMap);
        //단건 조회
        Integer number=memberMap.get("Isac");
        System.out.println("number = " + number);
        //삭제
        memberMap.remove("Isac");
        System.out.println("memberMap" + memberMap);

        //키확인
        Set<String> keySet=memberMap.keySet();
        System.out.println("keySet = " + keySet);
    }
}
