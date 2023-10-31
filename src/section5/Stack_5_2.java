package section5;

import java.util.Scanner;
import java.util.Stack;

public class Stack_5_2 {
    public int solution(String str) {
        // 최종적으로 잘려진 조각의 총 개수를 담을 변수
        int result = 0;
        // 쇠막대 하나를 셀 때마다 count 해주는 stack
        // <> : 제네릭타입, 사용자 지정으로 타입을 지정해서 사용하기 위함
        Stack<Character> stack = new Stack<>();
        // 연속되는 ')' (쇠막대 하나당 끝인지)를 확인하기 위한 boolean, true면 연속되는 것.
        boolean isStickEnd = false;
        // ( : 쇠막대 하나의 시작을 알림
        // ) : 쇠막대 하나의 끝을 알림
        // () : 레이저 하나의 발사로 쇠막대를 절단한 것이므로 지금까지 존재했던 쇠막대의 개수만큼 최종 result에 합산
        // )가 연속적으로 나오는 것 : 쇠막대 하나의 끝이 하나씩 댕강 잘려나가는 것으로 result에는 하나씩 합산해주고 stack도 하나씩 pop
        for(char c : str.toCharArray()) {
            // ( : 쇠막대의 시작이므로 stack에 하나씩 쌓아줌
            if(c == '(') {
                stack.push(c);
                // '('가 시작되면 boolean값은 false로 초기화.
                isStickEnd = false;
            } else {
                // 연속되는 ')'일 때
                if(isStickEnd) {
                   stack.pop();
                   result++;
                // 연속되지 않는 ')'일 때
                } else {
                    // stack에서 하나씩 빼주고
                    stack.pop();
                    // result에 stack.size (막대 count)한 만큼 합산
                    result += stack.size();
                }
                // ')'가 연속되었는지 확인하기 위해 true로 설정
               isStickEnd = true;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Stack_5_2 T = new Stack_5_2();
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        System.out.println(T.solution(str));
    }
}
