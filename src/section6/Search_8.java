package section6;

import java.util.Scanner;

public class Search_8 {
    public int solution(int size, int num, int[] arr) {
        int lt=0, rt=size-1;

        for(int i=0; i<size; i++) {
            int tmp=i;
            for(int j=i+1; j<size; j++) {
                if(arr[tmp] > arr[j]) tmp = j;
            }

            if(tmp != i) {
                int temp = arr[i];
                arr[i] = arr[tmp];
                arr[tmp] = temp;
            }
        }

        while(lt <= rt) {
            int idx = (lt + rt) / 2;
            if(num > arr[idx]) lt = idx+1;
            else if(num == arr[idx]) return idx+1;
            else rt = idx-1;
        }

        return -1;
    }
    public static void main(String[] args) {
        Search_8 T = new Search_8();
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int num = scan.nextInt();

        int[] arr = new int[size];

        for(int i=0; i<size; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(size, num, arr));


    }
}
