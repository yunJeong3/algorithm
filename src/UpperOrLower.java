import java.util.Scanner;

public class UpperOrLower {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        String str = scan.next();
        String convertedStr = "";

        for(int i=0; i<str.length(); i++) {
            char charForStr = str.charAt(i);

            // 추출된 문자열이 대문자라면
            if(Character.isUpperCase(charForStr))
                convertedStr += Character.toLowerCase(charForStr);
            else
                convertedStr += Character.toUpperCase(charForStr);

        }
        System.out.println(convertedStr);
    }
}
