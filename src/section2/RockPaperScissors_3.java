package section2;

import java.util.Scanner;

public class RockPaperScissors_3 {
    public char[] solution(int arrLen, int[] aArr, int[] bArr) {
        char[] result = new char[arrLen];

        for(int i=0; i<arrLen; i++) {
            // A 차례를 기준으로 잡고 비기면 'D' 담기
            if(aArr[i] == bArr[i]) result[i] = 'D';
            // A가 이기는 조건이면 'A' 담기
            else if(aArr[i] == 1 && bArr[i] == 3) result[i] = 'A';
            else if(aArr[i] == 2 && bArr[i] == 1) result[i] = 'A';
            else if(aArr[i] == 3 && bArr[i] == 2) result[i] = 'A';
            // 나머지는 B가 이기기 때문에 'B' 담기
            else result[i] = 'B';
        }

        return result;
    }
    public static void main(String[] args) {
        RockPaperScissors_3 T = new RockPaperScissors_3();
        Scanner scan = new Scanner(System.in);
        int arrLen = scan.nextInt();
        int[] aArr = new int[arrLen];
        int[] bArr = new int[arrLen];

        // A 패를 담기
        for(int i=0; i<arrLen; i++) {
            aArr[i] = scan.nextInt();
        }

        // B 패를 담기
        for(int i=0; i<arrLen; i++) {
            bArr[i] = scan.nextInt();
        }

        // 결과 배열 출력
        for(char c : T.solution(arrLen, aArr, bArr)) {
            System.out.println(c);
        }
    }
}
