package section2;

import java.util.Scanner;

public class CountTallPeople_2 {
    public int solution(int[] arr, int arrLen) {
        // 첫 번째 아이로 담기
        int tall = arr[0];
        int cnt = 1;

        for(int i=1; i<arrLen; i++) {
            // 두번째 아이부터 큰 아이만 새로 담고, cnt 1씩 증가
            if(tall < arr[i]) {
                cnt++;
                tall = arr[i];
            }
        }

        return cnt;
    }
    public static void main(String[] args) {
        // n명의 학생이 일렬로 서있고 처음부터 키가 큰 학생으로 새로 갱신해 담고, 갱신된 만큼 숫자로 담기
        CountTallPeople_2 T = new CountTallPeople_2();
        Scanner scan = new Scanner(System.in);

        int arrLen = scan.nextInt();
        int[] arr = new int[arrLen];

        for(int i=0; i<arrLen; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(arr, arrLen));

    }
}
