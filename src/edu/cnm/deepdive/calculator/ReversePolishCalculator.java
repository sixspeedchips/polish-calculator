package edu.cnm.deepdive.calculator;

import java.util.Arrays;
import java.util.LinkedList;

public class ReversePolishCalculator implements Calculator {

  @Override
  public Double calculate(String postfixString) {

    String[] parsed = parse(postfixString);
    System.out.println(Arrays.toString(parsed));
    return null;
  }

  private String[] parse(String inputString) {
    return inputString.strip().split(" ");
  }

  String x = "  1 1 23 5";

  String[] arrayofs x.strip().split(" ");
  LinkedList<String> stack = new LinkedList<>(String);
    for (ele : arrayofs){
    if (ele == "+"){
      int op1 = Integer.parseInt(stack.pop());
      int op2 = Integer.parseInt(stack.pop());
      stack.push(String.valueOf(op1+op2));
    } else if (ele == "-"){
      int op1 = Integer.parseInt(stack.pop());
      int op2 = Integer.parseInt(stack.pop());
      stack.push(String.valueOf(op1-op2));
    } else if (ele == "*"){
      int op1 = Integer.parseInt(stack.pop());
      int op2 = Integer.parseInt(stack.pop());
      stack.push(String.valueOf(op1*op2));
    } else if (ele == "/"){
      int op1 = Integer.parseInt(stack.pop());
      int op2 = Integer.parseInt(stack.pop());
      stack.push(String.valueOf(op1/op2));
    } else{
      stack.push(ele);
    }
  }
    System.out.println(stack);

}
