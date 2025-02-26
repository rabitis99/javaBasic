package chapter1.array;

import java.util.Arrays;

public class arrayMain {
    public static void main(String[] args) {
        int[] intArr={3, 4, 7, 10, 15, 20};
        System.out.print("짝수 : ");
        for (int i:intArr){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        //intArr의 재사용
        intArr=new int[3];
        intArr[0]=2;
        intArr[1]=5;
        intArr[2]=8;
        System.out.println("");
        System.out.println(Arrays.toString(intArr));
        int sum=0;

        for ( int i:intArr){
            sum+=i;
        }
        System.out.println("누적합 :" +sum);

        boolean[][] board = {
                {true, false},
                {false, true}
        };
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == true){
                    System.out.println("검은돌(●) 위치: ("+i+","+j+")");
                }
            }
        }
    }
}
