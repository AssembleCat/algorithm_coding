package algorithm.java.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*단어 뒤집기
N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
▣ 입력설명
첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되
어 있습니다.
▣ 출력설명
N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
▣ 입력예제 1
3
good
Time
Big
▣ 출력예제 1
doog
emiT
giB
*/
public class 단어뒤집기 {
    public String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public String[] solution(String[] s, int n){
        String[] answer = new String[n];

        int index = 0;
        for(String x: s){
            answer[index++] = reverse(x);
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        단어뒤집기 T = new 단어뒤집기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = br.readLine();
        }
        for(String x: T.solution(str, n)){
            System.out.println(x);
        }

    }
}
