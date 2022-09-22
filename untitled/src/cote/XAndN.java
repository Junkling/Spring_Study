package cote;

import java.util.Arrays;

public class XAndN {
        public long[] solution(int x, int n) {
            long[] answer = new long[n];

            long sum = 0;
                for (int i = 0; i < n; i++) {
                    sum=sum+x;
                    answer[i] = sum;


                }
            return answer;
        }

    public static void main(String[] args) {
        XAndN xAndN = new XAndN();
        long[] solution = xAndN.solution(-4, 5);
        System.out.println("solution = " + Arrays.toString(solution));

    }
    }

