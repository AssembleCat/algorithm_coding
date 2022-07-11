package algorithm.java.SimpleAlgo;

import java.util.Scanner;

public class 재귀팩토리얼 {
    public static void main(String[] args){
        재귀팩토리얼 M = new 재귀팩토리얼();
        Scanner sc = new Scanner(System.in);
    }
    public int Factorial(int n){
        if(n == 1) return 1;
        else return n*Factorial(n-1);
    }
}
