package section3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindCommonEle_2 {
    public ArrayList<Integer> solution(int arr1Len, int arr2Len, int[] arr1, int[] arr2){
        ArrayList<Integer> resultArr = new ArrayList<Integer>();

        // 오름차순 정렬 (삽입정렬)
        for(int i=1; i<arr1Len; i++) {
            int tmp = arr1[i], j;
            for(j=i-1; j >= 0; j--) {
                if(tmp < arr1[j]) arr1[j+1] = arr1[j];
                else break;
            }
            arr1[j+1] = tmp;
        }

        for(int i=1; i<arr2Len; i++) {
            int tmp = arr2[i], j;
            for(j=i-1; j >= 0; j--) {
                if(tmp < arr2[j]) arr2[j+1] = arr2[j];
                else break;
            }
            arr2[j+1] = tmp;
        }

        // 1배열, 2배열 공통으로 존재하는 원소만 담기
        int p1=0, p2=0;

        // p1, p2 둘 중 하나가 배열의 끝까지 갈 때까지 반복
        while(p1 < arr1Len && p2 < arr2Len) {
            // p1, p2 위치의 값이 같으면 p1,p2 1씩증가
            if(arr1[p1] == arr2[p2]) {
                // 일치하면 결과값 담기
                resultArr.add(arr1[p1++]);
                p2++;

            // p1 위치의 값이 p2위치 값보다 작으면 p1 증가
            // 정렬한 후에 값을 찾는데 p2위치와 같은 값만 찾아야 하기 때문에 작은 값은 의미가 없다.
            } else if(arr1[p1] < arr2[p2]) p1++;
            else p2++;
        }

        return resultArr;
    }

    public static void main(String[] args) {
        // 두 배열의 일치하는 값만 오름차순 해서 출력하기
        FindCommonEle_2 T = new FindCommonEle_2();
        Scanner scan = new Scanner(System.in);

        int arr1Len = scan.nextInt();
        int[] arr1 = new int[arr1Len];

        for(int i=0; i<arr1Len; i++) {
            arr1[i] = scan.nextInt();
        }

        int arr2Len = scan.nextInt();
        int[] arr2 = new int[arr2Len];

        for(int i=0; i<arr2Len; i++) {
            arr2[i] = scan.nextInt();
        }


        for(int n: T.solution(arr1Len, arr2Len, arr1, arr2)) {
            System.out.print(n + " ");
        }

    }
}
