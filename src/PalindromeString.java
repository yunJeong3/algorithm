import java.util.Scanner;

public class PalindromeString {
    public boolean solution(String str) {
        boolean isTrue = false;
        StringBuilder check = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--) {
            check.append(str.charAt(i));
        }

        if(str.contentEquals(check.toString())) isTrue = true;

        return isTrue;
    }
    public static void main(String[] args) {
        // 앞에서 읽을 때랑 뒤에서 읽을 때 같은 문자열인 회문 문자열 체크
        PalindromeString T = new PalindromeString();
        Scanner scan = new Scanner(System.in);
        String str = scan.next().toUpperCase();

        if(T.solution(str)) System.out.println("YES");
        else System.out.println("NO");

    }
}
