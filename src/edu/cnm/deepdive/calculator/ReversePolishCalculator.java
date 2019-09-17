package edu.cnm.deepdive.calculator;

import java.util.LinkedList;

public class ReversePolishCalculator implements Calculator {

  LinkedList<Double> stack;


  @Override
  public Double calculate(String postfixString) {

    stack = new LinkedList<>();

    String[] parsed = parse(postfixString);

    for (String ele : parsed) {
      try {
        stack.push(Double.parseDouble(ele));
      } catch (NumberFormatException e) {
        operate(ele);
      }

    }
    return stack.peek();
  }

  private String[] parse(String inputString) {
    return inputString.strip().split(" ");
  }


  private void operate(String s){

    if(s.equals("*")){
      stack.push(stack.pop()*stack.pop());
    }
    else if(s.equals("+")){
      stack.push(stack.pop()+stack.pop());
    }
    else if(s.equals("/")){
//      Double temp = stack.pop();
      stack.push(stack.pop()/stack.pop());
    }
    else if(s.equals("-")){
//      Double temp = stack.pop();
      stack.push(stack.pop()-stack.pop());

    }
  }

}
