package cote;


import javax.swing.*;

public class PhoneNum {
    public String solution(String phone_number) {
        String answer = "";
        String[] num = phone_number.split("");
        int i = 0;
        for (i = 0; i < num.length; i++) {
            if (i < num.length - 4) {
                answer += "*";
            } else {
                answer += num[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        PhoneNum phoneNum = new PhoneNum();
        String solution = phoneNum.solution("01027380106");
        System.out.println("phoneNum = " + solution);

    }
}