package section3;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineTwoArrays_1 {
    public ArrayList<Integer> solution(int arr1Len, int[] arr1, int arr2Len, int[] arr2) {
        ArrayList<Integer> resultArr = new ArrayList<>();
        int p1=0, p2=0;

        // pointer를 각각 지정해서, 둘 중 한 포인터가 배열의 끝까지 가면 while문 종료
        while(p1 < arr1Len && p2 < arr2Len) {
            // 첫번째 배열의 p1 위치와 두번째 배열의 p2 위치 비교해서 작은 수를 resultArr에 담아주고 포인터 증가
            if(arr1[p1] < arr2[p2]) resultArr.add(arr1[p1++]);
            else resultArr.add(arr2[p2++]);
        }

        // 끝까지 가지 못한 한 포인터를 배열의 끝까지 이동
        while(p1 < arr1Len) resultArr.add(arr1[p1++]);
        while(p2 < arr2Len) resultArr.add(arr2[p2++]);

        return resultArr;
    }
    public static void main(String[] args) {
        CombineTwoArrays_1 T = new CombineTwoArrays_1();
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr1 = new int[N];

        for(int i=0; i<N; i++) {
            arr1[i] = scan.nextInt();
        }

        int M = scan.nextInt();
        int[] arr2 = new int[M];

        for(int i=0; i<M; i++) {
            arr2[i] = scan.nextInt();
        }

        ArrayList<Integer> resultArr = T.solution(N, arr1, M, arr2);
        for(int i=0; i<resultArr.size(); i++) {
            System.out.print(resultArr.get(i) + " ");
        }
    }
}
