import java.util.Scanner;

public class PalindromeString2 {
    public static void main(String[] args) {
        // test -> found7, time: study; Yduts; emit, 7Dnuof
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        // 알파벳만 거르기
        str = str.toUpperCase().replaceAll("[^A-Z]", "");

        // String -> 문자 뒤집기 -> String변환
        String temp = new StringBuilder(str).reverse().toString();

        // 일치 : YES, 불일치 : NO
        if(temp.equals(str)) System.out.println("YES");
        else System.out.println("NO");
    }
}
