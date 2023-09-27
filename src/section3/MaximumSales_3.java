package section3;

import java.util.Scanner;

public class MaximumSales_3 {
    public int solution(int openDays, int conDays, int[] arr) {
        int result, sum=0;

        // 0부터 conDays 만큼 합산한 값을 sum과 result에 넣어주기
        for(int i=0; i<conDays; i++) sum += arr[i];
        result = sum;

        // 인덱스를 이동해주며 sum값 확인하여 result값 갱신
        // i ~ conDays 인덱스까지 합한 값에서 i인덱스(arr[i])를 합하고 i 바로 이전인덱스(arr[i-conDays])를 뺀다.
        for(int i=conDays; i<openDays; i++) {
            sum += (arr[i] - arr[i-conDays]);
            result = Math.max(sum, result);
        }

        return result;
    }
    public static void main(String[] args) {
        MaximumSales_3 T = new MaximumSales_3();

        // Scanner 객체 생성
        Scanner scan = new Scanner(System.in);

        // 총 운영 일수 입력 받기
        int openDays = scan.nextInt();

        // 최대 매출액을 구할 연속된 일수 입력 받기
        int conDays = scan.nextInt();

        // 배열 크기 설정 및 값 입력 받기
        int[] arr = new int[openDays];
        for(int i=0; i<openDays; i++) {
            arr[i] = scan.nextInt();
        }

        // 최대 매출액 계산 및 출력하기
        System.out.println(T.solution(openDays, conDays, arr));
    }
}
