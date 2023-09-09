import java.util.Scanner;

public class CharRepeatCount {
    public static void main(String[] args) {
        // 같은 문자가 연속으로 반복되는 만큼 반복횟수 표기
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        // 결과 저장
        StringBuilder result = new StringBuilder();
        int count = 1;
        // 비교할 char
        char compareChar = str.charAt(0);

        for(int i=1; i<str.length(); i++) {
            if(compareChar == str.charAt(i)) {
                count ++;
            } else {
                result.append(compareChar);
                if(count > 1) result.append(count);
                // 비교할 char 변경
                compareChar = str.charAt(i);
                count = 1;
            }
        }

        // 마지막 값 넣기
        result.append(compareChar);
        if(count > 1) result.append(count);
        System.out.println(result);

    }
}