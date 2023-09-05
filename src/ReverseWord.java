import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int wordsCount = scan.nextInt();
        String word = "";
        String reversedWord = "";

        for(int i=0; i<wordsCount; i++) {
            word = scan.next();
            reversedWord = "";

            int wordLength = word.length();

            for(int j = wordLength-1 ; j>= 0; j--) {
                reversedWord += word.charAt(j);
            }

            System.out.println(reversedWord);
        }


    }
}
