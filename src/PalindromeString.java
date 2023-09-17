import java.util.Scanner;

public class PalindromeString {
    public boolean solution(String str) {

        int lt = 0;
        int rt = str.length()-1;

        while(lt < rt) {
            if(str.charAt(lt) != str.charAt(rt)) return false;
            lt++;
            rt--;
        }
        return true;
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
