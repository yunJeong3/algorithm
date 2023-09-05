import java.util.Scanner;

public class SearchLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next().toUpperCase();

        char letter = Character.toUpperCase(scan.next().charAt(0));

        int count = 0;

        for (int i=0; i<str.length(); i++) {
            if(letter == str.charAt(i)) {
                count ++;
            }
        }

        System.out.println(count);

    }
}
