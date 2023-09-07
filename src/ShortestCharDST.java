import java.util.Scanner;

public class ShortestCharDST {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = scan.next().charAt(0);

        int[] distances = new int[str.length()];
        int distance = str.length();

        // 왼 -> 오 검사
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == c) distance = 0;

            distances[i] = distance++;
        }

        // 오 -> 왼 검사
        distance = str.length();
        for(int i=str.length()-1; i>=0; i--) {
            if(str.charAt(i) == c) distance = 0;

            distances[i] = Math.min(distances[i], distance++);
        }

        // 결과 출력
        for(int i=0; i<distances.length; i++) {
            if(i==distances.length-1) System.out.println(distances[i]);
            else System.out.print(distances[i] + " ");
        }
    }
}
