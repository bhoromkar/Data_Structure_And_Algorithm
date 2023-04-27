package com.bridgelabz.datastructure.unorderedlist;

import java.util.*;
    public class BalancedArithmeticExpression {

        public static boolean isBalanced(String exp) {
            Stack<Character> stack = new Stack<Character>();
            for (int i = 0; i < exp.length(); i++) {
                char ch = exp.charAt(i);
                if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }

        public static void main(String[] args) {
            String exp = "(5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)";
            System.out.println(isBalanced(exp)); // Output: true
        }
    }


