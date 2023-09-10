import java.util.Scanner;

public class LargeNumOutput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // 받은 개수
        int refNum = Integer.parseInt(scan.nextLine());

        // N개의 정수
        String inputNumbers = scan.nextLine();

        String[] numArr = inputNumbers.split(" ");
        int cnt = 0;

        // int number = Integer.parseInt(n);
        for(int i=1; i<numArr.length; i+=2) {
            int frontNumber = Integer.parseInt(numArr[i-1]);
            int backNumber = Integer.parseInt(numArr[i]);

            System.out.print(frontNumber + " ");
            if(i != numArr.length-1) {
                if(frontNumber < backNumber) System.out.print(backNumber + " ");
            } else {
                if(frontNumber < backNumber) System.out.print(backNumber);
            }
        }

    }
}
