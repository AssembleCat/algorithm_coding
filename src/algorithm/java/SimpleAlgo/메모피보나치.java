package algorithm.java.SimpleAlgo;

import java.io.*;

public class 메모피보나치 {
    static int[] fibo;
    public static void main(String[] args) throws IOException {
        메모피보나치 M = new 메모피보나치();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        fibo = new int[n+1];
        br.close();
        bw.write(Integer.toString(M.DFS(n)));
        bw.flush();
        bw.close();
    }
    public int DFS(int n){
        if(fibo[n]>0) return fibo[n];
        if(n == 1) return fibo[n] = 1;
        else if(n == 2) return fibo[n] = 1;
        else return fibo[n] = DFS(n-2) + DFS(n-1);
    }
}
