import java.util.Scanner;

public class LongestWord {
    public String solution(String str) {
        String result = "";
        // int의 최소값으로 초기화
        int max = Integer.MIN_VALUE;
        String[] s = str.split(" ");

        for(String x : s) {
            int len = x.length();
            if(len > max) {
                max = len;
                result = x;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        LongestWord T = new LongestWord();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(T.solution(str));
    }
}
