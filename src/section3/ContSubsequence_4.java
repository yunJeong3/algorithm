package section3;

import java.util.Scanner;

public class ContSubsequence_4 {
    public int solution(int size, int value, int[] arr) {
        /*
         lt 위치의 값과 rt 위치의 값을 합산하여 sum으로 value와 같은지 체크하고
         합산한 sum 값보다 lt ~ rt 위치 범위의 값보다 커지면 lt위치의 값을 sum 에서 차감한 후 lt 위치를 1 증가
         작거나 같다면 rt를 증가하고 sum에 rt 값을 합산하여 증가.
         value값보다 크거나 같은 상태라면 계속 sum 에서 arr[lt] 값을 차감해줘야 한다.
        */
        int result = 0;

        int lt = 0;
        int sum = 0;

        for(int rt=0; rt<size; rt++) {
            // rt를 계속 증가하여 sum 값에 저장
            sum += arr[rt];

            // sum 값이 value값과 일치하면 result 증가
            if(sum == value) result++;
            // sum 이 value값과 비교 시 같거나 클때 반복
            while(sum >= value) {
                // sum 값에 lt 위치의 값을 차감해주고 lt 위치 이동
                sum -= arr[lt++];
                // sum과 value 값이 같다면 result 증가
                if(sum == value) result++;
            }
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
