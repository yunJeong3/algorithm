package section4;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram_2 {
    public boolean solution(String str1, String str2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        boolean result = true;

        for(int i=0; i<str1.length(); i++) {
            Character c1 = str1.charAt(i);
            Character c2 = str2.charAt(i);

            map1.put(c1, map1.getOrDefault(c1, 0)+1);
            map2.put(c2, map2.getOrDefault(c2, 0)+1);

        }

        for(char c : map1.keySet()) {
            if(!map1.get(c).equals(map2.get(c))) return false;
        }

        return result;
    }
    public static void main(String[] args) {
        Anagram_2 T = new Anagram_2();
        Scanner scan = new Scanner(System.in);

        String str1 = scan.next();
        String str2 = scan.next();

        boolean isTrue = T.solution(str1, str2);
        if(isTrue) System.out.println("YES");
        else System.out.println("NO");
    }
}
