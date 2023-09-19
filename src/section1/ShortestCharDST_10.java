package section1;

import java.util.Scanner;

public class ShortestCharDST_10 {
    public int[] solution(String str, char c) {
        int[] resultArr = new int[str.length()];

        // 처음 for문은 왼쪽부터 1씩 증가시켜 저장, 이때 배열에는 두 for문에서 측정된 숫자 중
        // '최소 거리'를 담기 위한 '최소 숫자'가 담기게 됨.
        // 좌측 끝 숫자들은 0을 만나기 전까지 최소 숫자에 측정되지 않게 하기 위해 초깃값 1000으로 설정.
        int n = 1000;
        // 문자를 하나씩 추출하여 c랑 동일할 때만 0, 아니면 +1씩 증가
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == c) {
                n = 0;
                resultArr[i] = n;
            }
            else {
                System.out.println(n);
                n++;
                resultArr[i] = n;
            }
        }

        // 두 번째 for문은 오른쪽부터 1씩 감소시키며 저장,
        // 우측 끝 숫자들은 0을 만나기 전까지 최소 숫자에 측정되지 않게 하기 위해 초깃값 1000으로 설정.
        n = 1000;
        // c랑 동일할 때만 0, 아니면 -1씩 감소
        for(int i=str.length()-1; i>=0; i--) {
            if(str.charAt(i) == c) n = 0;
            else n++;
            if(resultArr[i] > n) resultArr[i] = n;
        }

        return resultArr;
    }
    public static void main(String[] args) {
        // 문자열 s와 문자 t가 주어지면, 문자열 s의 각 문자가 문자t와 떨어진 최소거리를 출력
        ShortestCharDST_10 T = new ShortestCharDST_10();
        Scanner scan= new Scanner(System.in);

        String str = scan.next();
        char c = scan.next().charAt(0);

        for(int i: T.solution(str, c)) {
            System.out.print(i + " ");
        }
    }
}
