package algorithm.java.String;


import java.io.*;

/*
* 가장 짧은 문자거리
한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출
력하는 프로그램을 작성하세요.
▣ 입력설명
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
문자열의 길이는 100을 넘지 않는다.
▣ 출력설명
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
▣ 입력예제 1
teachermode e
▣ 출력예제 1
1 0 1 2 1 0 1 2 2 1 0
* */
public class 가장짧은문자거리 {
    public int[] solution(String s, char target){
        int[] answer = new int[s.length()];
        int dis = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == target) {
                answer[i] = 0;
                dis = 0;
            }
            else{
                answer[i] = ++dis;
            }
        }
        dis = 0;
        for(int j=s.length()-1; j>=0; j--){
            if(s.charAt(j) == target) {
                answer[j] = 0;
                dis = 0;
            }
            else{
                dis++;
                if(answer[j] > dis)
                    answer[j] = dis;
            }
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        가장짧은문자거리 T = new 가장짧은문자거리();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        char target = br.readLine().charAt(0);

        for(int x : T.solution(str, target)){
            bw.write(x + " ");
        }
        bw.flush();
        bw.close();
    }
}
