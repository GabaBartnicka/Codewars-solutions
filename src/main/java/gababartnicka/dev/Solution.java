package gababartnicka.dev;

import java.util.Stack;

public class Solution {
    public double evaluate(String expr) {
        if (expr.isBlank())
            return 0;

        final var expressionElements = expr.split(" ");
        final Stack<Double> stack = new Stack<>();

        for (String element : expressionElements) {
            try {
                var value = Double.valueOf(element);
                stack.push(value);
            } catch (Exception e) {
                var b = stack.pop();
                var a = stack.pop();
                switch (element) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }
            }
        }
        return stack.pop();
    }
}