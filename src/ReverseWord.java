import java.util.ArrayList;
import java.util.Scanner;

public class ReverseWord {
    public ArrayList<String> solution(String[] strArr) {
        ArrayList<String> result = new ArrayList<>();

        // 문자 하나 당 전체 뒤집기
//        for(String x : strArr) {
//            // StringBuilder라는 String객체 생성 -> reverse메소드로 문자 하나하나의 순서 뒤집고
//            // -> String 으로 변환
//            String tmp = new StringBuilder(x).reverse().toString();
//            // 뒤집어진 문자 result에 담기
//            result.add(tmp);
//        }

        // 문자 하나 당 lt, rt로 나눠 각 문자 뒤집기
        for(String x : strArr) {
            char[] s = x.toCharArray();
            int lt=0, rt=x.length()-1;
            while(lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            // s 문자배열을 String화 시켜줌.
            // valueOf : static으로 선언된 class 메소드.
            // class.valueOf로 접근 가능
            String tmp = String.valueOf(s);
            result.add(tmp);
        }

        return result;
    }
    public static void main(String[] args) {
        ReverseWord T = new ReverseWord();
        Scanner scan = new Scanner(System.in);

        int strLen = scan.nextInt();
        String[] strArr = new String[strLen];

        for(int i=0; i<strLen; i++) {
            strArr[i] = scan.next();
        }

        for(String x : T.solution(strArr)) {
            System.out.println(x);
        }
    }
}
