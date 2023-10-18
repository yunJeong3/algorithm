package section3;

import java.util.Scanner;

public class MaxLen_6 {
    public int solution(int arrLen, int changeCnt, int[] arr) {
        /*
        cnt: 0 -> 1로 몇 번 변경했는지 임시 저장
        result: 최대 길이를 담을 수 저장
        changeCnt: 0 -> 1로 변경 가능한 수
        . rt로 index 1씩 증가하며, rt위치에 0이 있으면 cnt 증가
        . cnt가 changeCnt를 초과하면 lt index를 1씩 증가하여 lt위치에서 0을 만나면 cnt 감소하고 lt 1번 증가 후 반복문 종료
        . [기존 result 값]과 [rt-lt한 값에 index 감안하여 1 증가한 값]을 비교하여 큰 값을 result에 다시 저장
            => result는 최대 길이가 담김.
        */
        int result=0, cnt=0, lt=0;

        for(int rt=0; rt<arrLen; rt++) {
            if(arr[rt] == 0) cnt++;
            while(cnt > changeCnt) {
                if(arr[lt] == 0) cnt--;
                lt++;
            }
            result = Math.max(result, rt-lt+1);
        }

        return result;
    }
    public static void main(String[] args) {
        MaxLen_6 T = new MaxLen_6();
        Scanner scan = new Scanner(System.in);
        int arrLen = scan.nextInt();
        int changeCnt = scan.nextInt();
        int[] arr = new int[arrLen];

        for(int i=0; i<arrLen; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(T.solution(arrLen, changeCnt, arr));

    }
}
