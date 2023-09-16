import java.util.Scanner;

public class DecimalCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int decimalCount = 0;
        for(int i=2; i<=N; i++) {
            int count = 0;
            for(int j=2; j<=9  ; j++) {
                if(j > i) break;
                if(j == i) continue;
                if(i % j == 0) {
                    count++;
                    break;
                }
            }

            if(count == 0) decimalCount++;
        }

        System.out.println(decimalCount);
    }
}
