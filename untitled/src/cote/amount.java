package cote;

public class amount {
    public int solution(int a, int b) {
        int answer = 0;
        int x = 0;
        int st = 0;
        if(a>b){
            x= a-b;
            st=b;
        }else{
            x= b-a;
            st=a;
        }
        answer = st;
        for(int i=0; i<=x; i++){
            System.out.println(answer);
            answer=answer+st;
            st++;
        }

        return answer;
    }

    public static void main(String[] args) {
        amount amount = new amount();
        int solution = amount.solution(3, 5);
        System.out.println("amount = " + solution);
    }
}

