import java.util.Scanner;

public class InterpretingCode {
    public String solution (String str) {
        StringBuilder result = new StringBuilder();

        // 제곱근 측정할 숫자, 아스키코드로 변환할 합산 값
        int cnt = 0, sum = 0;
        for(char c : str.toCharArray()) {
            cnt++;
            // c가 '#'이면 측정한 제곱근을 반영한 값 합산(sum)
            if(c == '#') sum += (int) Math.pow(2, 7-cnt);

            // 문자 하나당 7까지 체크, 체크 끝나면 result에 담아주고 sum, cnt 초기화
            if(cnt == 7) {
                result.append((char) sum);
                sum = 0;
                cnt = 0;
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
        // 암호문을 해석해서 출력
       InterpretingCode T = new InterpretingCode();
       Scanner sc = new Scanner(System.in);

       int n = sc.nextInt();
       String str = sc.next();

       for(char x : T.solution(str).toCharArray()) {
           System.out.print(x + "");
       }
    }
}
