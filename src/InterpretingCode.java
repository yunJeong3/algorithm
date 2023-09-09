import java.util.Scanner;

public class InterpretingCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 보낸 문자의 개수
        int len = scan.nextInt();

        // 입력받은 암호문
        String str = scan.next();
        // 해석한 암호문 담을 배열
        char[] text = new char[len];
        int cnt = 0;
        int num = 1;

        // 변환된 2진수
        String resultStr = "";
        for(char x : str.toCharArray()) {
            if(cnt == 7 * num) {
                text[num-1] = (char) Integer.parseInt(resultStr, 2);
                resultStr = "";
                num++;
            }

            if(x == '#') resultStr += '1';
            else resultStr += '0';

            cnt++;

        }
        text[num-1] = (char) Integer.parseInt(resultStr, 2);

        for(char x : text) {
            System.out.print(x);
        }
    }
}
