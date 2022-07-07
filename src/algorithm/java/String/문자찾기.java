package algorithm.java.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
* 문자 찾기
한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개
존재하는지 알아내는 프로그램을 작성하세요. 대소문자를 구분하지 않습니다.
문자열의 길이는 100을 넘지 않습니다.
▣ 입력설명
첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
문자열은 영어 알파벳으로만 구성되어 있습니다.
▣ 출력설명
첫 줄에 해당 문자의 개수를 출력한다.
▣ 입력예제 1
Computercooler
c
▣ 출력예제 1
2
* */
public class 문자찾기 {
    public int solution(String s, char target){
        int answer = 0;
        s = s.toLowerCase();
        target = Character.toLowerCase(target);
        for(char x : s.toCharArray()){
            if(x == target)
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        문자찾기 T = new 문자찾기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char c = br.readLine().charAt(0);
        System.out.print(T.solution(str, c));
    }
}