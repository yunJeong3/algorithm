package section2;

import java.util.Scanner;

public class Mentoring_12 {
    public int solution(int stuLen, int testLen, int[][] arr) {
        int result = 0;

        // x -> 방향, 멘토
        for(int i=0; i<stuLen-1; i++) {
            int mento = -1, menti = -1;

            // x -> 방향 멘티
            for(int j=i+1; j<stuLen; j++) {
                // mento 순위가 menti순위보다 높을 때 true 설정
                boolean isTrue = false;
                // y는 기준 멘티가 바뀔 때마다 초기화
                int y = 0;
                mento = arr[y][i];
                menti = arr[y][j];

                for(y+=1; y<testLen; y++) {
                    // y변동 한 후의 x를 -> 방향으로 체크 (k)
                    for(int k=0; k<stuLen; k++) {
                        // 왼쪽부터 체크 시 menti가 먼저 보이면, mento의 순위가 menti보다 낮기 때문에
                        // isTrue = false 후 break, 반대면 true 후 break
                        if(arr[y][k] == menti) {
                            isTrue = false;
                            break;
                        }
                        else if(arr[y][k] == mento) {
                            isTrue = true;
                            break;
                        }
                    }
                    // isTrue가 false면 mento순위가 menti 순위보다 낮기 때문에 바로 break
                    if(!isTrue) break;
                }
                // for문이 끝까지 돌았을 때 true면 result 추가.
                if(isTrue) result++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Mentoring_12 T = new Mentoring_12();
        Scanner scan = new Scanner(System.in);
        int stuLen = scan.nextInt();
        int testLen = scan.nextInt();

        int[][] arr = new int[testLen][stuLen];
        for(int i=0; i<testLen; i++) {
            for(int j=0; j<stuLen; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println(T.solution(stuLen, testLen, arr));
    }
}
