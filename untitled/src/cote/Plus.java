package cote;
import java.util.*;
public class Plus  {
    public int solution(int n) {
        int answer = 0;

        String num = Integer.toString(n);
        String[] num1 = num.split("");
        for (int i=0; i<num1.length; i++) {
            answer = answer + Integer.parseInt(num1[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Plus plus = new Plus();
        int n = 123;
        System.out.println("n = " + plus.solution(n));
    }
}
