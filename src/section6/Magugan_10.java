package section6;

import java.util.Arrays;
import java.util.Scanner;

public class Magugan_10 {
    static int lt, rt;
    public int[] sort(int magugans, int[] maguganArr) {
        // 마구간 좌표를 오름차순으로 정렬
        for(int i=0; i<magugans; i++) {
            int tmp=i;
            for(int j=i+1; j<magugans; j++) {
                if(maguganArr[tmp] > maguganArr[j]) tmp = j;
            }
            if(tmp != i) {
                int temp = maguganArr[i];
                maguganArr[i] = maguganArr[tmp];
                maguganArr[tmp] = temp;
            }
        }
        return maguganArr;
    }

    public int horseArrangement(int[] maguganArr, int middle, int magugans) {
        int count = 1;
        int target = maguganArr[0];
        for(int i=1; i<magugans; i++) {
            if(maguganArr[i] - target >= middle) {
                count++;
                target = maguganArr[i];
            }
        }
        return count;
    }
    public int solution(int maguganCnt, int horseCnt, int[] maguganArr) {
        int result = Integer.MIN_VALUE;
        int[] sortedArr = sort(maguganCnt, maguganArr);

        // 마구간 사이의 거리 (시작지점) 담기
        lt = 1;
        // 최대 거리(마지막지점) 담기
        rt = sortedArr[maguganCnt-1] - sortedArr[0];

        // 말 배치 시 '가장 가까운' 말의 거리가 최대가 되는 '최대값'을 구할 때까지 배치하기
        while(lt <= rt) {
            // 기준점 잡기
            int middle = (lt+rt)/2;
            // 말을 배치해본 후 기준점보다 배치한 말이 많다면 범위를 늘리기
            int deployCnt = horseArrangement(sortedArr, middle, maguganCnt);
            if(deployCnt >= horseCnt) {
                result = middle;
                lt = middle+1;
            } else if(deployCnt < horseCnt) {
                rt = middle-1;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Magugan_10 T = new Magugan_10();
        Scanner scan = new Scanner(System.in);
        // 마구간의 수
        int maguganCnt = scan.nextInt();
        // 말의 수
        int horseCnt = scan.nextInt();
        // 마구간 좌표
        int[] maguganArr = new int[maguganCnt];
        for(int i=0; i<maguganCnt; i++) {
            maguganArr[i] = scan.nextInt();
        }

        System.out.println(T.solution(maguganCnt, horseCnt, maguganArr));

    }
}
