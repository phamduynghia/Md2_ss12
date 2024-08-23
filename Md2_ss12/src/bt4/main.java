package bt4;

import java.util.Stack;

public class main {
    public static void main(String[] args) {

        String expression1 = "s * (s – a) * (s – b) * (s – c)";
        String expression2 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        String expression3 = "s * (s – a) * (s – b * (s – c)";
        String expression4 = "s * (s – a) * s – b) * (s – c)";

        System.out.println(StringTemplate.STR."Biểu thức 1: \{isValidExpression(expression1) ? "Well" : "Not Well"}");
        System.out.println(StringTemplate.STR."Biểu thức 2: \{isValidExpression(expression2) ? "Well" : "Not Well"}");
        System.out.println(StringTemplate.STR."Biểu thức 3: \{isValidExpression(expression3) ? "Well" : "Not Well"}");
        System.out.println(StringTemplate.STR."Biểu thức 4: \{isValidExpression(expression4) ? "Well" : "Not Well"}");
    }

    public static boolean isValidExpression(String expression) {

        Stack<Character> bStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char sym = expression.charAt(i);

            if (sym == '(' || sym == '{' || sym == '[') {
                bStack.push(sym);
            } else if (sym == ')' || sym == '}' || sym == ']') {

                if (bStack.isEmpty()) {
                    return false;
                }

                char left = bStack.pop();

                if (!isMatchingPair(left, sym)) {
                    return false;
                }
            }
        }

        return bStack.isEmpty();
    }

    public static boolean isMatchingPair(char left, char right) {
        return (left == '(' && right == ')') ||
                (left == '{' && right == '}') ||
                (left == '[' && right == ']');
    }
}

