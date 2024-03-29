package _20_ValidParentheses;

import java.util.Stack;

public class Solution {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if (!stack.empty()) {
                if ((stack.peek() == '{' && s.charAt(i) == '}') || (stack.peek() == '(' && s.charAt(i) == ')') ||
                        (stack.peek() == '[' && s.charAt(i) == ']')) {
                    stack.pop();
                }else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String s = "(])";
        System.out.println(isValid(s));
    }
}
