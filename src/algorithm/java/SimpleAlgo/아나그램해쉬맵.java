package algorithm.java.SimpleAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class 아나그램해쉬맵 {
    public static void main(String[] args) throws IOException {
        아나그램해쉬맵 M = new 아나그램해쉬맵();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine().trim();
        String s2 = br.readLine().trim();
    }
    public String solution(String s1, String s2){
        String answer = "YES";
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char x : s1.toCharArray()){
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        for(char x: s2.toCharArray()){
            if(!hm.containsKey(x) || hm.get(x) < 1) return "NO";
            hm.put(x, hm.get(x)-1);
        }
        return answer;
    }
}
