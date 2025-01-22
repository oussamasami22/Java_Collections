import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char p : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (p == '(' || p == '{' || p == '[') {
                stack.push(p);
            } 
            // Check matching for closing brackets
            else if (p == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (p == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (p == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } 
            // If unmatched or stack is empty
            else {
                return false;
            }
        }
        // If the stack is empty, all brackets are valid
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("()"));       // Output: true
        System.out.println(solution.isValid("()[]{}"));   // Output: true
        System.out.println(solution.isValid("(]"));       // Output: false
        System.out.println(solution.isValid("([)]"));     // Output: false
        System.out.println(solution.isValid("{[]}"));     // Output: true
    }
}
