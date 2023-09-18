import java.util.Scanner;

public class PalindromeString2 {
    public boolean solution(String str) {
        StringBuilder result = new StringBuilder();
        for(char c : str.toCharArray()) {
            if(Character.isAlphabetic(c)) result.append(Character.toUpperCase(c));
        }

        int lt = 0;
        int rt = result.length()-1;

        while(lt < rt) {
            if(result.charAt(lt) != result.charAt(rt)) return false;
            lt++;
            rt--;
        }

        return true;
    }
    public static void main(String[] args) {
        // 앞, 뒤에서 읽을 때 같은 문자열인지 체크
        PalindromeString2 T = new PalindromeString2();
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        if(T.solution(str)) System.out.println("YES");
        else System.out.println("NO");

    }
}
