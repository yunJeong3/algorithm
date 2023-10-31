package section5;

import java.util.Scanner;
import java.util.Stack;

public class Postfix_4_2 {
    public int solution(String str) {
        int result = 0;
        // 후위 연산을 위해 처음부터 체크해서 숫자일 때에는 stack에 담고,
        // 연산일 때에는 담은 숫자와 해당 연산자와 연산하여 결과값도 다시 stack에 담는다.
        Stack<Integer> stack = new Stack<>();

        // 후위식연산을 위해 str 하나씩 c로 담기
        for(char c : str.toCharArray()) {
            // c가 숫자일 때 stack에 담기
            if(Character.isDigit(c)) {
                // 숫자로 변환하여 c에 담기
                stack.push((int) c - 48);
            // 숫자가 아닌 연산자일 때에는 stack에서 pop하여 그 숫자와 함께 연산
            } else {
                // 최근에 담긴 숫자가 두번째 피연산자가 된다.
                int num = stack.pop();
                if(c == '+') {
                    stack.push(stack.pop() + num);
                } else if(c == '-') {
                    stack.push(stack.pop() - num);
                } else if(c == '*') {
                    stack.push(stack.pop() * num);
                } else {
                    stack.push(stack.pop() / num);
                }
            }
        }
        result = stack.pop();
        return result;
    }
    public static void main(String[] args) {
        Postfix_4_2 T = new Postfix_4_2();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));
    }
}
