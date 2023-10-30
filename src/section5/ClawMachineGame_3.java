package section5;

import java.util.ArrayList;
import java.util.Scanner;

public class ClawMachineGame_3 {
    public int solution(int size, int[][] arr, int moves, int[] moveArr) {
        int result = 0;

        ArrayList<Integer> v = new ArrayList<>();

        for(int i=0; i<moves; i++) {
            // 뽑을 x의 위치를 담을 숫자
            int moveIdx = moveArr[i]-1;

            for(int j=0; j<size; j++) {
                if(arr[j][moveIdx] != 0) {
                    if(!v.isEmpty() && arr[j][moveIdx] == v.get(v.size()-1)){
                        v.remove(v.size()-1);
                        result += 2;
                    }else {
                        v.add(arr[j][moveIdx]);
                    }
                    arr[j][moveIdx] = 0;
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ClawMachineGame_3 T = new ClawMachineGame_3();
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int[][] arr = new int[size][size];

        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        int moves = scan.nextInt();
        int[] moveArr = new int[moves];

        for(int i=0; i<moves; i++) {
            moveArr[i] = scan.nextInt();
        }

        System.out.println(T.solution(size, arr, moves, moveArr));
    }
}
