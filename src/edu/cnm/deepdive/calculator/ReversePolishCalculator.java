package edu.cnm.deepdive.calculator;
import static edu.cnm.deepdive.calculator.Operations.operators;
import java.util.LinkedList;

class ReversePolishCalculator {

  private static final LinkedList<Double> stack = new LinkedList<>();

  static Double calculate(String postfixString) {

    stack.clear();
    for (String token : parse(postfixString)) {
      try {
        stack.push(Double.parseDouble(token));
      } catch (NumberFormatException e) {
        operators.get(token).operate(stack);
      }

    }

    return stack.peek();
  }

  private static String[] parse(String inputString) {
    return inputString.strip().split(" ");
  }

}
