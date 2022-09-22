package cote;

public class PY {
        boolean solution(String s) {
            String[] a = s.split("");
            int result = 0;
            s.substring(1);
            s.charAt(1);
            for(String i : a){
                if(i.equals("p")||i.equals("P")){
                    result++;
                }
                if(i.equals("y")||i.equals("Y")){
                    result--;
                }
            }
            boolean answer = result == 0 ? true : false;
            // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
            System.out.println("result" + result);

            return answer;
        }
    }