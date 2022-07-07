package algorithm.java.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*대소문자 변환
대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로
변환하여 출력하는 프로그램을 작성하세요.
▣ 입력설명
첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
문자열은 영어 알파벳으로만 구성되어 있습니다.
▣ 출력설명
첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
▣ 입력예제 1
StuDY
▣ 출력예제 1
sTUdy
아스키코드 65~90 = 대문자
         97~122 = 소문자
대소문자간의 차이 32
*/
public class 대소문자변환 {
    public String solution(String s){
        StringBuilder sb = new StringBuilder();
        for(char x : s.toCharArray()){
            if(x >= 65 && x <= 90)
                x += 32;
            else
                x -= 32;
            sb.append(x);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        대소문자변환 T = new 대소문자변환();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(T.solution(str));
    }
}
