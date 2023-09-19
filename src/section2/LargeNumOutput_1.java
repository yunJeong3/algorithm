package section2;

import java.util.ArrayList;
import java.util.Scanner;

public class LargeNumOutput_1 {
    public ArrayList<Integer> solution(int arrLen, int[] arr) {
        ArrayList<Integer> resultArr = new ArrayList<>();
        // 첫 번째 값은 필수로 넣어야 하기 때문에 담기
        resultArr.add(arr[0]);

        for(int i=0; i<arrLen-1; i++) {
            // 뒷 수가 더 크면 resultArr에 담기
            if(arr[i] < arr[i+1]) resultArr.add(arr[i+1]);
        }

        return resultArr;
    }
    public static void main(String[] args) {
        LargeNumOutput_1 T = new LargeNumOutput_1();
        Scanner scan = new Scanner(System.in);

        int arrLen = scan.nextInt();
        int[] arr = new int[arrLen];

        // 입력받은 숫자들 배열에 담기
        for(int i=0; i<arrLen; i++) {
            arr[i] = scan.nextInt();
        }

        // 결과를 담은 배열 출력하기
        for(int n : T.solution(arrLen, arr)) {
            System.out.print(n + " ");
        }

    }
}
