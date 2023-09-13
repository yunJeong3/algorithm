import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        /*
8 32
23 87 65 12 57 32 99 81
         */
        Scanner scan = new Scanner(System.in);
        int arrLen = scan.nextInt();
        int target = scan.nextInt();

        int[] arr = new int[arrLen];

        for(int i=0; i<arrLen; i++) {
            arr[i] = scan.nextInt();
        }

        // 이분검색은 정렬이 되어있어야 함
        // 삽입정렬
        for(int i=1; i<arrLen; i++) {
            int temp = arr[i], j;

            for(j=i-1; j>=0; j--) {
                if(temp < arr[j]) {
                    arr[j+1] = arr[j];
                } else break;
            }
            arr[j+1] = temp;
        }

        // 이분검색 (index 기준)
        int lt = 0;
        int rt = arrLen-1;
        int result = 0;

        while(lt <= rt) {
            int mid = (lt+rt)/2; // 처음index: 3, 값: 57
            if(arr[mid] == target){
                result = mid+1;
                break;
            } else if(arr[mid] > target) {
                rt = mid-1;
            } else {
                lt = mid+1;
            }
        }

        for(int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();

        System.out.println(result);
    }
}
