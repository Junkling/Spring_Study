package cote;

import java.util.Arrays;

public class arrTest {
    public String[] solution(int n, int [] arr1, int [] arr2) {
        String [] answer = new String[n];
        int [] secretMap = new int[n];
        for(int i = 0; i < n; i++) {
            secretMap[i] = arr1[i] | arr2[i];
            System.out.println("secretMap = " + Arrays.toString(secretMap));
        }
        int x = 9|30;
        System.out.println("x = " + x);
        return answer;
    }

    public static void main(String[] args) {
        arrTest arrTest = new arrTest();
        int[] arr1 ={9, 20, 28, 18, 11};
        int[] arr2 ={30, 1, 21, 17, 28};
        String[] solution = arrTest.solution(5, arr1, arr2);
        System.out.println("arr2 = " + Arrays.toString(solution));
    }
}
