import java.util.Scanner;

public class PalindromeString2 {
    public boolean solution(String str) {
        String result = "";
        for(char c : str.toCharArray()) {
            if(Character.isAlphabetic(c)) result += c;
        }
        result = result.toUpperCase();
        String reverse = "";

        for(int i=result.length()-1; i>=0; i--) {
            reverse += result.charAt(i);
        }

        return reverse.equals(result);
    }
    public static void main(String[] args) {
        // 앞, 뒤에서 읽을 때 같은 문자열인지 체크
        PalindromeString2 T = new PalindromeString2();
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        if(T.solution(str)) System.out.println("YES");
        else System.out.println("NO");

    }
}
