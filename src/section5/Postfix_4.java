package section5;

import java.util.Scanner;
import java.util.Stack;

public class Postfix_4 {
    public int solution(String str) {
        Stack<Integer> stack = new Stack<>();
        for(char c: str.toCharArray()) {
            if(Character.isDigit(c)) {
                stack.push((int)c - 48);
            } else {
                int rt = stack.pop();
                if(c == '+') {
                    stack.push(stack.pop() + rt);
                } else if(c == '-') {
                    stack.push(stack.pop() - rt);
                } else if(c == '*') {
                    stack.push(stack.pop() * rt);
                } else {
                    stack.push(stack.pop() / rt);
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        Postfix_4 T = new Postfix_4();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));
    }
}
