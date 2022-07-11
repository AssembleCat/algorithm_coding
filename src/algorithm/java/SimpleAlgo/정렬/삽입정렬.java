package algorithm.java.SimpleAlgo.정렬;

public class 삽입정렬 {
    public int[] sorting(int n, int[] arr){
        for(int i=1; i<n; i++){
            int tmp = arr[i], j;
            for(j=i-1; j>=0; j--){
                if(arr[j] > arr[j+1]) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;
        }
        return arr;
    }
    public static void main(String[] args) {

    }
}
