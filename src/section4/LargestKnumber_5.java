package section4;

import java.util.Arrays;
import java.util.Scanner;

public class LargestKnumber_5 {
    public int solution(int[] array, int n, int k) {
        int result = 0;


        System.out.println(Arrays.toString(array));

        return result;
    }
    public static void main(String[] args) {
        LargestKnumber_5 T = new LargestKnumber_5();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println(T.solution(array, n, k));

    }
}
