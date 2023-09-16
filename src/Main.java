import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String result = "";
        // 입력받은 문자의 대소문자 변환기

        // A-Z: 65~90, a-z: 97~122 [32]
        for(char x : str.toCharArray()) {
            if(x >= 65 && x <= 90) result += (char)(x+32);
            else result += (char)(x-32);
        }

        return result;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        System.out.println(T.solution(str));
    }
}