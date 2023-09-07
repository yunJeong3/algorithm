import java.util.Scanner;

public class ExtractNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String extractNumber = "";

        for(char x : str.toCharArray()) {
            if(Character.isDigit(x)) {
                extractNumber += x;
            }
        }

        System.out.println(Integer.parseInt(extractNumber));
    }
}
