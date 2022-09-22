package cote;

public class SquareRoot {
    public long solution(long n) {
        long answer = 0;
        for(int i = 0; i*i<=n; i++){
            if(i*i==n){
                answer=((i+1)*(i+i));
                break;
            }else{
                answer=-1L;
            }
        }
        return answer;
    }
}