package edu.cnm.deepdive.calculator;

import java.util.LinkedList;

public class ReversePolishCalculator {

  private static final LinkedList<Double> stack = new LinkedList<>();

  static Double calculate(String postfixString) {

    stack.clear();
    for (String ele : parse(postfixString)) {
      try {
        stack.push(Double.parseDouble(ele));
      } catch (NumberFormatException e) {
        operate(ele);
      }

    }
    return stack.peek();
  }

  private static String[] parse(String inputString) {
    return inputString.strip().split(" ");
  }


  private static void operate(String s){

    switch (s) {
      case "*":
        stack.push(stack.pop() * stack.pop());
        break;
      case "+":
        stack.push(stack.pop() + stack.pop());
        break;
      case "/":
        stack.push(stack.pop() / stack.pop());
        break;
      case "-":
        stack.push(stack.pop() - stack.pop());

        break;
    }
  }

}
