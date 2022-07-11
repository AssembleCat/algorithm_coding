package algorithm.java.SimpleAlgo;

//문자열의 문자가 고유한지 검사하는 로직
public class 고유문자검사 {
    public static void main(String[] args) {

    }
    public boolean isUnique(String s){
        boolean[] char_set = new boolean[128];
        for(char x : s.toCharArray()) {
            if(char_set[x]){
                return false;
            }
            char_set[x] = true;
        }
        return true;
    }
}
