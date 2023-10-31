package section6;

import java.util.Scanner;

public class Magugan_10_2 {
    public int[] sort(int maguganCnt, int[] maguganArr) {
        for(int i=0; i<maguganCnt; i++) {
            int tmp=i;
            for(int j=i+1; j<maguganCnt; j++) {
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
    public int horseDeployment(int middle, int maguganCnt, int[] sortedArr) {
        // 시작점을 지정하여 배치할 수 있는 말의 개수 측정하기
        int target = sortedArr[0];
        int count = 1;
        for(int i=1; i<maguganCnt; i++) {
            if(sortedArr[i]-target >= middle) {
                count++;
                target = sortedArr[i];
            }
        }
        return count;
    }

    public int solution(int maguganCnt, int targetHorseCnt, int[] maguganArr) {
        int result = Integer.MIN_VALUE;
        // 입력받은 마구간의 좌표 오름차순 정렬
        int[] sortedArr = sort(maguganCnt, maguganArr);
        // lt: 최소 거리(시작점), rt: 최대 거리(마지막점)
        int lt=1, rt=sortedArr[maguganCnt-1] - sortedArr[0];
        // 이분검색을 통해 말과 말 사이가 가장 가까우면서 최대한 먼 거리를 구하기
        while(lt <= rt) {
            // 이분검색의 중심점을 구해서 중심점이 최종적으로 구해야하는 targetHorseCnt보다 크거나 같으면 범위를 늘리고 result 갱신
            int middle = (lt+rt)/2;
            int deployment = horseDeployment(middle, maguganCnt, sortedArr);
            if(deployment >= targetHorseCnt) {
                result = middle;
                lt = middle+1;
            } else {
                rt = middle-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Magugan_10_2 T = new Magugan_10_2();
        Scanner scan = new Scanner(System.in);

        int maguganCnt = scan.nextInt();
        int targetHorseCnt = scan.nextInt();
        int[] maguganArr = new int[maguganCnt];
        for(int i=0; i<maguganCnt; i++) {
            maguganArr[i] = scan.nextInt();
        }
        System.out.println(T.solution(maguganCnt, targetHorseCnt, maguganArr));
    }
}
