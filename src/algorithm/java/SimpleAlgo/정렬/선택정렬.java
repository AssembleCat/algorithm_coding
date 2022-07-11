package algorithm.java.SimpleAlgo.정렬;

/*
 0번째에 0번쨰로 작은 숫자를 놓는 컨셉 -> 앞에서부터 정렬하는 컨셉
 n길이를 n번확인
 0번째 숫자를 기억하고 1번째 ~ n번째 사이에서 최솟값의 위치를 찾아냄
 tmp변수를 이용해 두 자리 변환
* */
public class 선택정렬 {
    public static void main(String[] args) {

    }
    public int[] sorting(int[] arr){
        int length = arr.length;
        //총 길이의 한단계 전까지 돌아야함 이중for문에서 바로 뒤 인덱스의 값과 비교하기 때문
        for(int i=0; i<length-1; i++){
            //idx에 i위치를 저장 바뀔대상의 값을 의미함
            int idx = i;
            //i뒤의 값부터 끝까지 순회하며 가장 작은값을 찾음
            for(int j=i+1; j<length; j++){
                //작은 값의 위치를 업데이트 및 저장함
                if(arr[j] < arr[idx]) idx = j;
            }
            //이중for문을 돌며 얻은 위치 값을 통해 바꿔줌
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }
}
