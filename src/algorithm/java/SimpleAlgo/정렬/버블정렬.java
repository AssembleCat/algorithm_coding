package algorithm.java.SimpleAlgo.정렬;

public class 버블정렬 {
    public int[] solution(int n, int[] arr){
        //0~n-1까지 순회하기 위한 첫번째 for문
        for(int i=0; i<n-1; i++){
            //순회 횟수에 맞춰 뒤에서부터 정렬된 부분은 비교하지 않는 for문
            for(int j=0; j<n-i-1; j++){
                //j가 j+1보다 클경우 switch
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
