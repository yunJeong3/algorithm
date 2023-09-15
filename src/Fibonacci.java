import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arrLen = scan.nextInt();
        int[] arr = new int[arrLen];

        arr[0] = 1;
        arr[1] = 1;

        for(int i=2; i<arrLen; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
