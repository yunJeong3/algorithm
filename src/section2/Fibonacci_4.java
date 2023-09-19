package section2;

import java.util.Scanner;

public class Fibonacci_4 {
    public int[] solution(int len) {
        // 배열 사용 시
        int[] result = new int[len];

        result[0] = 1;
        result[1] = 1;

        for(int i=2; i<len; i++) {
            // result의 i-1 번째와 i-2번째를 합산한 값을 i번째에 담기
            result[i] = result[i-1] + result[i-2];
        }

        return result;

        // 변수에 담아서 출력만 할 때
//        int a=1, b=1, c;
//        System.out.print(a + " " + b + " ");
//        for(int i=2; i<len; i++) {
//            c = a + b;
//            System.out.print(c + " ");
//            a = b;
//            b = c;
//        }
    }
    public static void main(String[] args) {
        Fibonacci_4 T = new Fibonacci_4();
        Scanner scan = new Scanner(System.in);

        int len = scan.nextInt();

        // 배열 사용 시 출력
        for(int n : T.solution(len)) {
            System.out.print(n + " ");
        }

        // 그냥 출력만 할 때
        T.solution(len);
    }
}
