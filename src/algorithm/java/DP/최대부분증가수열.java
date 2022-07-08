package algorithm.java.DP;


public class 최대부분증가수열 {
    static int[] dp;
    public int solution(int[] arr){
        int answer=0;
        dp=new int[arr.length];
        dp[0]=1;
        for(int i=1; i<arr.length; i++){
            int max=0;
            for(int j=i-1; j>=0; j--){
                if(arr[j]<arr[i] && dp[j]>max) max=dp[j];
            }
            dp[i]=max+1;
            answer=Math.max(answer, dp[i]);
        }
        return answer;
    }
    public static void main(String[] args){

    }
}
