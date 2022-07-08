package algorithm.java.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
* 회문 문자열
앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력
하는 프로그램을 작성하세요.
단 회문을 검사할 때 대소문자를 구분하지 않습니다.
▣ 입력설명
첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
▣ 출력설명
첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
▣ 입력예제 1
gooG
▣ 출력예제 1
YES
* */

public class 회문문자열 {
    public String solution(String s){
        String answer = "YES";
        char[] c = s.toLowerCase().toCharArray();
        int lt= 0, rt = c.length-1;
        if(s.length() < 1){
            return "NO";
        }
        while (lt <rt){
            if(c[lt++] != c[rt--])
                return "NO";
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        회문문자열 T = new 회문문자열();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(T.solution(br.readLine()));
    }
}
