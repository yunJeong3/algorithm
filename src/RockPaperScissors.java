import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = Integer.parseInt(scan.nextLine());


        int[] aArr = new int[len];
        int[] bArr = new int[len];

        for(int i=0; i<len; i++) {
            aArr[i] = scan.nextInt();
        }

        for(int i=0; i<len; i++) {
            bArr[i] = scan.nextInt();
        }

        for(int i=0; i<len; i++) {
            if(aArr[i] == bArr[i]) System.out.println("D");

            // a가 이기는 조건 : B가 3, 1, 2 일 때
            else if(aArr[i] == 1 && bArr[i] == 3) System.out.println("A");
            else if(aArr[i] == 2 && bArr[i] == 1) System.out.println("A");
            else if(aArr[i] == 3 && bArr[i] == 2) System.out.println("A");

            else System.out.println("B");
        }
    }
}
