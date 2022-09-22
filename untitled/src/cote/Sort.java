package cote;

import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public Long solution(long n) {
        long answer = 0;
        String num = Long.toString(n);
        String[] split = num.split("");
        Arrays.sort(split, Collections.reverseOrder());
        String result ="";
        for (String s : split) {
            result = result + s;
        }
        answer = Long.parseLong(result);
        return answer;
    }

    public static void main (String[] arg){
        Sort a = new Sort();
        Long solution = a.solution(1234);
        System.out.println(solution);
    }
}

