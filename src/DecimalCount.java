import java.util.ArrayList;
import java.util.Scanner;

public class DecimalCount {
    public int solution(int max) {
        int resultCnt = 0;
        int[] arr = new int[max+1];

        for(int i=2; i<=max; i++) {
            // i번째가 0이면 count증가한다.
            if(arr[i] == 0) {
                resultCnt++;
                // i만큼(i의배수)돌아야함. 2의배수는 2씩 증가, 3의배수는 3씩증가
                for(int j=i; j<=max; j=j+i) arr[j] = 1;
            }
        }

        return resultCnt;
    }
    public static void main(String[] args) {
        // 에라토스테네스체를 통해 입력받은 수까지의 소수 갯수 세기.
        DecimalCount T = new DecimalCount();
        Scanner scan = new Scanner(System.in);

        int max = scan.nextInt();
        System.out.println(T.solution(max));
    }
}
