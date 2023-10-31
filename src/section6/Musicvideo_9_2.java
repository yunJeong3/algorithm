package section6;

import java.util.Scanner;

public class Musicvideo_9_2 {
    static int lt, rt;
    public int dvdCount(int middle, int[] dvdArr) {
        int sum = 0, count = 0;

        for(int i=0; i<dvdArr.length; i++) {
            sum += dvdArr[i];
            if(sum > middle) {
                count++;
                sum = dvdArr[i];
            }
        }
        return ++count;
    }
    public int solution(int songCount, int dvdCount, int[] dvdArr) {
        int result = Integer.MIN_VALUE;
        // lt: dvd 각각 하나씩 곡을 담을 수 있는 용량 (최소)
        lt = dvdArr[songCount-1];

        while(lt <= rt) {
            int middle = (lt+rt)/2;
            int dvdCnt = dvdCount(middle, dvdArr);
            if(dvdCnt <= dvdCount) {
                rt = middle -1;
                result = middle;
            } else {
                lt = middle +1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Musicvideo_9_2 T = new Musicvideo_9_2();
        Scanner scan = new Scanner(System.in);

        int songCount = scan.nextInt();
        int dvdCount = scan.nextInt();
        int[] dvdArr = new int[songCount];

        for(int i=0; i<songCount; i++) {
            dvdArr[i] = scan.nextInt();
            rt += dvdArr[i];
        }

        System.out.println(T.solution(songCount, dvdCount, dvdArr));
    }
}
