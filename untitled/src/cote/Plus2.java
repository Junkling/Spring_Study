package cote;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Plus2 {
    public int[] solution(int[] numbers) {
        int length = 0;
        for(int a=0; a<numbers.length; a++){
            length += a;
        }
        int[] answer = new int[length];
        int x = 0;
        for(int i=0; i<numbers.length-1; i++){
        int result=0;
            for(int j=i+1; j<numbers.length; j++){
                result = numbers[i] + numbers[j];
                answer[i] = result;
                System.out.println("result = " + result);
            answer[x] = result;
            x++;
            }
        }
        IntStream sorted = Arrays.stream(answer).distinct().sorted();
        System.out.println("answer = " + Arrays.toString(answer));

        return sorted.toArray();
    }

    public static void main(String[] args) {
        Plus2 plus2 = new Plus2();
        int[] a =new int[]{2, 1, 3, 4, 1};
        int[] solution = plus2.solution(a);
        System.out.println("solution = " + Arrays.toString(solution));

    }
}