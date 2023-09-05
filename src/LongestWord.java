import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();

        // 띄어쓰기를 기준으로 문장 분리
        String[] words = sentence.split(" ");

        String longestWord = "";
        int longestLength = 0;

        for(int i=0; i<words.length; i++) {
           if(words[i].length() > longestLength) {
               longestWord = words[i];
               longestLength = words[i].length();
           }
        }

        System.out.println("가장긴단어: " + longestWord);
    }
}
