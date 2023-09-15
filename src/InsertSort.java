import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {
/*
6
13 5 11 7 23 15
* */

        Scanner scan = new Scanner(System.in);
        int arrLen = scan.nextInt();
        int[] arr = new int[arrLen];

        for(int i=0; i<arrLen; i++) {
            arr[i] = scan.nextInt();
        }

        // 삽입정렬
        // index 1부터 비교를 해서 앞의 수가 크면 뒤의 수를 덮어씀, 반대면 종료
        for(int i=1; i<arrLen; i++) {
            int temp = arr[i], j;
            for(j=i-1; j>=0; j--) {
                if(arr[j] > temp) {
                    arr[j+1] = arr[j];
                } else break;
            }
            arr[j+1] = temp;
        }

        for(int n : arr) {
            System.out.print(n + " ");
        }
    }
}
