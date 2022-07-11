package algorithm.java.SimpleAlgo;

import java.io.*;

public class 재귀피보나치 {
    public static void main(String[] args) throws IOException {
        재귀피보나치 M = new 재귀피보나치();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        br.close();
        bw.write(Integer.toString(M.DFS(n)));
        bw.flush();
        bw.close();
    }
    public int DFS(int n){
        if(n == 1) return 1;
        else if(n == 2) return 1;
        else return DFS(n-2) + DFS(n-1);
    }
}
