import java.util.Scanner;

public class excludeDuplicateChar {
    public String solution(String strIn) {
        StringBuilder str = new StringBuilder();

        // 1. 이중for문 사용해서 첫 값을 넣어두고 끝까지 체크했을 때 중복되지 않으면 str에 값을 넣어줌
//        str.append(strIn.charAt(0));
//        for(int i=1; i<strIn.length(); i++) {
//            boolean dupl = false;
//            for(int j=0; j<str.length(); j++) {
//                if(strIn.charAt(i) == str.charAt(j)) dupl = true;
//            }
//            if(!dupl) str.append(strIn.charAt(i));
//        }

        // 2. for문과 indexOf를 사용해서 i값과 indexOf로 찾은 값이 다르면 담기
        // 시간복잡도O(N^2) 공간복잡도 O(N)
        for(int i=0; i<strIn.length(); i++) {
            if(i == strIn.indexOf(strIn.charAt(i))) str.append(strIn.charAt(i));
        }


        return str.toString();
    }
    public static void main(String[] args) {
        excludeDuplicateChar T = new excludeDuplicateChar();
        Scanner scan = new Scanner(System.in);
        String strIn = scan.next();

        System.out.println(T.solution(strIn));

    }
}
