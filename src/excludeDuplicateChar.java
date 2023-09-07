import java.util.Scanner;

public class excludeDuplicateChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String strIn = scan.next();
        String result = "";

        for(int i=0; i<strIn.length(); i++) {
            // i == indexOf : 중복되는 글자 없음, 중복 없을 때만 result에 추가
            if(i == strIn.indexOf(strIn.charAt(i)))
                result += strIn.charAt(i);
        }

        System.out.println(result);

    }
}
