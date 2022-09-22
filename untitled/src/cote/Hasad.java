package cote;

public class Hasad {
        public boolean solution(int x) {
            boolean answer = true;

            int a = x;
            int result = 0;
            while (x!=0) {
                result = result + (x % 10);
                x= x / 10;
}
            answer = a % result == 0 ? true : false;
                return answer;
        }

    public static void main(String[] args) {
        Hasad hasad = new Hasad();
        boolean solution = hasad.solution(18);
        System.out.println("solution = " + solution);
    }
    }
