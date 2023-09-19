import java.util.Scanner;

public class CharRepeatCount_11 {
    public String solution(String str) {
        StringBuilder result = new StringBuilder();
        // 마지막 결과값을 담기 위해 마지막은 빈칸 지정
        str += " ";

        int cnt = 1;
        for(int i=0; i<str.length()-1; i++) {
            if(str.charAt(i+1) == str.charAt(i)) cnt++;
            else {
                result.append(str.charAt(i));
                if(cnt > 1) {
                    result.append(cnt);
                    cnt = 1;
                }
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        // 같은 문자가 연속으로 반복되는 만큼 반복횟수 표기
        CharRepeatCount_11 T = new CharRepeatCount_11();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(T.solution(str));
    }
}