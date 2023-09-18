import java.util.Scanner;

public class ExtractNumber_9 {
    public int solution(String str) {
        StringBuilder result = new StringBuilder();

        for(char c : str.toCharArray()) {
            if(Character.isDigit(c)) result.append(c);
        }

        return Integer.parseInt(result.toString());
    }
    public static void main(String[] args) {
        // 입력받은 문자열에서 정수만 추출해 출력
        // ex) g0en2T0s8eSoft
        ExtractNumber_9 T = new ExtractNumber_9();
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        System.out.println(T.solution(str));
    }
}
