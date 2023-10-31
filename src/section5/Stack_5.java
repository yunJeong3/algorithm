package section5;

import java.util.Scanner;
import java.util.Stack;

public class Stack_5 {
    public int solution(String str) {
        int result = 0;
        // <> : 제네릭타입, 사용자 지정으로 타입을 지정해서 사용하기 위함
        Stack<Character> stack = new Stack<>();
        // 바로 직전에 ) 였는지 확인하기 위한 boolean, (면 false로 변환, )면 true 변환하고 result에 1만 추가하고 pop 한다.
        boolean isClosed = false;
        for(char c : str.toCharArray()) {
            // ( : stack에 추가해준다.
            if(c == '(') {
                stack.push(c);
                isClosed = false;
            }
            // ) : 기존 stack에 쌓여있는 것을 pop하고, result에 크기만큼 담아준다.
            else {
                // true면 바로 직전에 )였으므로 result에 1만 추가하고 pop 한다.
                if(isClosed) {
                    result += 1;
                    stack.pop();
                } else {
                    stack.pop();
                    result += stack.size();
                }
                isClosed = true;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Stack_5 T = new Stack_5();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));

    }
}
