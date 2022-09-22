package cote;

import javax.lang.model.type.ArrayType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i = 0;
        for (i=0; i<commands.length; i++) {
            int[] arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2]-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3,}, {4, 4, 1}, {1, 7, 3}};
        Solution solution = new Solution();
        int[] solution1 = solution.solution(array, commands);
        System.out.println("solution1 = " + Arrays.toString(solution1));
    }
}