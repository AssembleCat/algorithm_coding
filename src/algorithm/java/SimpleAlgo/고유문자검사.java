package algorithm.java.SimpleAlgo;

import java.util.HashMap;

//문자열의 문자가 고유한지 검사하는 로직
public class 고유문자검사 {
    public static void main(String[] args) {

    }
    public boolean isUniqueAscii(String s){
        boolean[] char_set = new boolean[128];
        for(char x : s.toCharArray()) {
            if(char_set[x]){
                return false;
            }
            char_set[x] = true;
        }
        return true;
    }
    public boolean isUniqueHash(String s){
        HashMap<Integer, Boolean> hm = new HashMap<>();
        for(char x : s.toCharArray()){
            int tmp = x;
            if(hm.containsKey(tmp)){
                return false;
            }
            hm.put(tmp, true);
        }
        return true;
    }
}
