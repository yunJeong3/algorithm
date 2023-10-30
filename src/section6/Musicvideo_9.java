package section6;

import java.util.Scanner;

public class Musicvideo_9 {
    // 최소의 dvd 개수를 출력하는 함수
    public int countDvd(int middle, int[] songArr) {
        // count: 최소 dvd 개수 return, lt: dvd 용량 측정을 위한 합산 시작 지점, rt: dvd 용량 측정 위한 합산 끝 지점
        // sum: 용량 측정을 위한 합산 최종 크기
        int count = 0, lt=0, rt=1, sum=songArr[lt];
        for(int i=1; i<songArr.length; i++) {
            sum += songArr[i];
            if(sum > middle) {
                count++;
                sum = songArr[i];
            }
        }

        return ++count;
    }
    public int solution(int songCnt, int dvd, int[] songArr) {
        // 최종 dvd의 개수
        int result = Integer.MIN_VALUE;
        // lt : dvd 최소 용량, 주어진 곡의 크기만큼 하나씩 담아줄 수 있는 수
        int lt=songArr[songCnt-1];
        // rt : dvd 최대 용량, dvd의 최소 개수로 담을 수 있는 최대 용량
        int rt = 0;
        for(int i=0; i<songCnt; i++) rt += songArr[i];

        // 반복문에서 최적의 dvd 용량과 최적의 dvd 개수를 구하기 위한 반복문, 최소 크기 범위(lt)와 최대 크기의 범위(rt)가 역전되면 안된다.
        while(lt <= rt) {
            // dvd 최소 용량과 dvd 최대 용량의 중간 값인 용량 middle 지정
            int middle = (lt + rt) / 2;
            // 주어진 배열의 길이에 middle 크기 만큼 곡 크기를 합산하여 넣어준다.
            int minDvdCount = countDvd(middle, songArr);
            // 측정한 dvd의 최소값이 원하는 dvd의 개수와 일치하는지 비교
            // 측정 dvd 최소값보다 원하는 dvd 개수가 클 때는 dvd의 용량이 크다고 볼 수 있음,
            if(minDvdCount <= dvd) {
                // rt 범위는 middle보다 1 줄인 용량으로 끝 지정.
                rt = middle-1;
                result = middle;
            // 측정 dvd 최소값보다 원하는 dvd 개수가 작을 때는 dvd의 용량이 작다고 볼 수 있음.
            } else {
                // lt 범위는 middle보다 1 키운 용량으로 시작점 지정.
                lt = middle+1;
            }
        }


        return result;
    }
    public static void main(String[] args) {
        Musicvideo_9 T = new Musicvideo_9();
        Scanner scan = new Scanner(System.in);

        int songCnt = scan.nextInt();
        int dvd = scan.nextInt();
        int[] songArr = new int[songCnt];

        for(int i=0; i<songCnt; i++) {
            songArr[i] = scan.nextInt();
        }

        System.out.println(T.solution(songCnt, dvd, songArr));
    }
}
