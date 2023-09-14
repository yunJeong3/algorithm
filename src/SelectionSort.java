import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        /* n개의 숫자가 입력되면 오름차순으로 정렬하는 프로그램 작성
6
13 5 11 7 23 15
        */
        Scanner scan = new Scanner(System.in);

        int arrLen = scan.nextInt();
        int[] arr = new int[arrLen];

        for(int i=0; i<arrLen; i++) {
            arr[i] = scan.nextInt();
        }

        // 첫 인덱스부터 하나하나 지정하고 선택한 인덱스보다 제일 작은 수가 변경됨
        for(int i=0; i<arrLen; i++) {
            int index = i;
            for(int j=i+1; j<arrLen; j++) {
                if(arr[index] > arr[j]) {
                    index = j;
                }
            }

            if(index != i) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }

        for(int n : arr) {
            System.out.print(n + " ");
        }


    }
}
