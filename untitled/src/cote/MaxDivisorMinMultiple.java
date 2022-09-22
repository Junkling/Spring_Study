package cote;

import java.util.Arrays;

public class MaxDivisorMinMultiple {
        public int[] solution(int n, int m) {
            int i = gcvSave(n, m);
            int mulNum = n * m;
            int gvc = gcvSave(n, m);

            int[] answer = {i,};
            return answer;
        }

    public int gcvSave(int n, int m) {

        if(m==0){
            return n;
        }else{
            return gcvSave(m, n % m);
        }

        }
        public int lcmSave(int mulNum, int gcv) {
            return mulNum / gcv;
        }
    }