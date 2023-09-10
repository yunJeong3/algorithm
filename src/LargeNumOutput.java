import java.util.Scanner;

public class LargeNumOutput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // 받은 개수
        int refNum = Integer.parseInt(scan.nextLine());

        // N개의 정수
        String inputNumbers = scan.nextLine();

        String[] numArr = inputNumbers.split(" ");

        System.out.print(numArr[0] + " ");  // 첫 번째 수는 무조건 출력

        for(int i=1; i<refNum; i++) {  // 두 번째 수부터 시작해서
            int currentNumber = Integer.parseInt(numArr[i]);
            int previousNumber = Integer.parseInt(numArr[i-1]);

            if(previousNumber < currentNumber) {  // 현재 수가 이전 수보다 크다면 출력
                System.out.print(currentNumber + " ");
            }

            if(i == refNum-1) {
                System.out.println();  // 마지막은 개행 처리
            }

        }

    }
}
