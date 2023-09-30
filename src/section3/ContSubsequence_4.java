package section3;

import java.util.Scanner;

public class ContSubsequence_4 {
    public int solution(int size, int value, int[] arr) {
        int result = 0;

        int sum = 0;
        for(int i=0; i<size; i++) {
            if(sum == value) {
                result++;
                sum = 0;
            }
            sum += arr[i];
        }

        return result;
    }
    public static void main(String[] args) {
        ContSubsequence_4 T = new ContSubsequence_4();
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int value = scan.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(size, value, arr));

    }
}
