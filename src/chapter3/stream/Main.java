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
        List<Integer> ret2 = arrayList.stream().map(num -> num * 10).collect(Collectors.toList());
        System.out.println("ret2 = " + ret2);

        // 직접 map() 활용해보기
        // 1. 익명클래스를 변수에 담아 전달 안되는 이유찾기
//        Function<Integer, Integer> function = new Function<>() {
//
//            @Override
//            public Integer apply(Integer integer) {
//                return integer * 10;
//            }
//        };
//        List<Integer> ret3 = arrayList.stream()
//                .map(function)
//                .collect(Collectors.toList());
//        System.out.println("ret3 = " + ret3);

        // 2. 람다식을 변수에 담아 전달
        Function<Integer, Integer> functionLambda = (num -> num * 10);
        List<Integer> ret4 = arrayList.stream()
                .map(functionLambda)
                .collect(Collectors.toList());
        System.out.println("ret4 = " + ret4);

        // 람다식 직접 활용
        List<Integer> ret5 = arrayList.stream()
                .map(num -> num * 10)
                .collect(Collectors.toList());
        System.out.println("ret5 = " + ret5);
    }
}