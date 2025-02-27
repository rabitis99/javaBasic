package chapter3.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {

        // ArrayList 선언
        List<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        // 스트림 없이: 각 요소 * 10 처리
        ArrayList<Integer> ret1 = new ArrayList<>();
        for (Integer num : arrayList) {
            int multipliedNum = num * 10;
            ret1.add(multipliedNum);
        }
        System.out.println("ret1 = " + ret1);

        // 스트림 활용: 각 요소 * 10 처리
        List<Integer> ret2 = arrayList.stream() // 1. 데이터 흐름 준비
                .map(num -> num * 10)    // 2. 중간 연산 등록
                .collect(Collectors.toList());  // 3. 최종 연산 단계
        System.out.println("ret2 = " + ret2);

        // 직접 map() 활용해보기
        // 1. 익명클래스를 변수에 담아 전달
        Function<Integer, Integer> function = new Function<>() {

            @Override
            public Integer apply(Integer integer) {
                return integer * 10;
            }
        };
        List<Integer> ret3 = arrayList.stream()// 1. 데이터 흐름 준비
                .map(function)                 // 2. 중간 연산 등록
                .collect(Collectors.toList()); // 3. 최종 연산 단계
        System.out.println("ret3 = " + ret3);

        // 2. 람다식을 변수에 담아 전달
        Function<Integer, Integer> functionLambda = (num -> num * 10);//변수맘대로
        List<Integer> ret4 = arrayList.stream()// 1. 데이터 흐름 준비
                .map(functionLambda)           // 2. 중간 연산 등록
                .collect(Collectors.toList()); // 3. 최종 연산 단계
        System.out.println("ret4 = " + ret4);

        // 3. 람다식 매개변수에 직접 활용
        List<Integer> ret5 = arrayList.stream()// 1. 데이터 흐름 준비
                .map(num -> num * 10)   // 2. 중간 연산 등록
                .collect(Collectors.toList()); // 3. 최종 연산 단계
        System.out.println("ret5 = " + ret5);

        // 중간 연산 함께 사용 방법(filter()+map))
        // 요구 사항: 리스트 짝수를 찾아서 *10
        // -1 짝수 찾기
        // -2 *10
        List<Integer> ret6 = arrayList.stream()  // 1. 데이터 흐름 준비
                .filter(num ->num %2 == 0)// 2. 중간 연산 등록(짝수찾기)
                .map(num -> num*10)       // 3. 중간 연산 등록(*10)
                .collect(Collectors.toList());   // 4. 최종 연산 단계
        System.out.println("ret6 = " + ret6);

        // 리스트로 사용힉;
        List<Integer> ret7 = ret1.stream()  // 1. 데이터 흐름 준비
                .filter(num ->num %2 == 0)// 2. 중간 연산 등록(짝수찾기)
                .map(num -> num*10)       // 3. 중간 연산 등록(*10)
                .collect(Collectors.toList());   // 4. 최종 연산 단계
        System.out.println("ret7 = " + ret7);
    }
}
