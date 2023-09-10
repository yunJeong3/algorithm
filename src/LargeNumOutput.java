import java.util.Scanner;

public class LargeNumOutput {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // 기준이 되는 숫자
        int refNum = Integer.parseInt(scan.nextLine());

        // N개의 정수
        String inputNumbers = scan.nextLine();

        String[] numArr = inputNumbers.split(" ");
        int cnt = 0;

        for(String n : numArr) {
            int number = Integer.parseInt(n);

            if(number >= refNum) {
                if(cnt == numArr.length-1) {
                    System.out.print(number);
                } else {
                    System.out.print(number + " ");
                }
            }
            else if(cnt == 0) System.out.print(number + " ");

            cnt ++;
        }

    }
}
