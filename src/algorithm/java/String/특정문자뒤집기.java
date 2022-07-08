package algorithm.java.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*특정 문자 뒤집기
영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고, 특수문자는 자기
자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
▣ 입력설명
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
▣ 출력설명
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
▣ 입력예제 1
a#b!GE*T@S
▣ 출력예제 1
S#T!EG*b@a
*/
public class 특정문자뒤집기 {
    public String solution(String s){
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        int left = 0;
        int right = c.length-1;
        while (left < right){
            if(Character.isAlphabetic(c[left]) && Character.isAlphabetic(c[right])){
                char tmp = c[left];
                c[left] = c[right];
                c[right] = tmp;
            }
            left++;
            right--;
        }
        for(char x : c)
            sb.append(x);

        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        특정문자뒤집기 T = new 특정문자뒤집기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(T.solution(s));
    }
}
