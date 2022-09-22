package cote;

import java.util.Arrays;
import java.util.Collections;

public class Collatz {
    public int[] solution(long n) {
        int length = Long.toString(n).length();
        int[] answer = new int[length];
        long x = n;
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) n % 10;
            n = n / 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        Collatz collatz = new Collatz();
        int[] solution = collatz.solution(12345);
        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));

    }
}





