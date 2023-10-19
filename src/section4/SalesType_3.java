package section4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SalesType_3 {
    public ArrayList<Integer> solution(int[] arr, int arrLen, int len) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // hashmap에 미리 len 크기의 -1만큼 값을 담아준다.
        for(int i=0; i<len-1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        int lt=0;
        // len-1 위치부터 시작해서 끝까지 for문 돌려줌
        for(int rt=len-1; rt<arrLen; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) +1);
            result.add(map.size());
            map.put(arr[lt], map.get(arr[lt])-1);
            if(map.get(arr[lt]) == 0) map.remove(arr[lt]);
            lt++;
        }


        return result;
    }
    public static void main(String[] args) {
        SalesType_3 T = new SalesType_3();
        Scanner scan = new Scanner(System.in);
        int arrLen = scan.nextInt();
        int len = scan.nextInt();
        int[] arr = new int[arrLen];

        for(int i=0; i<arrLen; i++) {
            arr[i] = scan.nextInt();
        }

        for(int n: T.solution(arr, arrLen, len)) {
            System.out.print(n + " ");
        }

    }
}
