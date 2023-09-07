import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next().toUpperCase();

        String reverseStr = "";

        for(int i=str.length()-1 ; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }

        System.out.println(str);
        System.out.println(reverseStr);

        // 앞으로, 뒤로 모두 같은 문잔지 확인
        if(str.equals(reverseStr)) System.out.println("YES");
        else System.out.println("NO");
    }
}
