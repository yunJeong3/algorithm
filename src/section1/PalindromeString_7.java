package section1;

import java.util.Scanner;

public class PalindromeString_7 {
    public boolean solution(String str) {

        int lt = 0;
        int rt = str.length()-1;

        // while문으로 반복하면서 lt rt 위치의 문자가 다르면 false 반환
        while(lt < rt) {
            if(str.charAt(lt) != str.charAt(rt)) return false;
            lt++;
            rt--;
        }
        return true;
    }
    public static void main(String[] args) {
        // 앞에서 읽을 때랑 뒤에서 읽을 때 같은 문자열인 회문 문자열 체크
        PalindromeString_7 T = new PalindromeString_7();
        Scanner scan = new Scanner(System.in);
        String str = scan.next().toUpperCase();

        if(T.solution(str)) System.out.println("YES");
        else System.out.println("NO");

    }
}
