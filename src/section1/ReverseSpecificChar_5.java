package section1;

import java.util.Scanner;

public class ReverseSpecificChar_5 {
    public String solution(String str) {
        String result = "";

        char[] c = str.toCharArray();
        int lt = 0, rt = c.length-1;

        // lt < rt 조건일 때만 while문 실행
        while (lt < rt) {

            // 각각 문자가 아니면 lt++ OR rt--;
            if(!Character.isAlphabetic(c[lt])) lt++;
            else if(!Character.isAlphabetic(c[rt])) rt--;
            // lt rt 중 문자가 아닌게 없으면 변환
            else {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;

                lt++;
                rt--;
            }
        }

        str = String.valueOf(c);
        result += str;

        return result;
    }
    public static void main(String[] args) {
        ReverseSpecificChar_5 T = new ReverseSpecificChar_5();
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        System.out.println(T.solution(str));

    }
}
