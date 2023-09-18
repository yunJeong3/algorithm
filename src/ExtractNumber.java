import java.util.Scanner;

public class ExtractNumber {
    public int solution(String str) {
        StringBuilder strResult = new StringBuilder();

        for(char c : str.toCharArray()) {
            // c가 숫자인지 확인 (isDigit)
            if(Character.isDigit(c)) {
                strResult.append(c);
            }
        }

        return Integer.parseInt(strResult.toString());
    }
    public static void main(String[] args) {
        // 입력받은 문자열에서 정수만 추출해 출력
        ExtractNumber T = new ExtractNumber();
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        System.out.println(T.solution(str));
    }
}
