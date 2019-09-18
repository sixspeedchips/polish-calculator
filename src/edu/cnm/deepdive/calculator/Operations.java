package edu.cnm.deepdive.calculator;

import java.util.HashMap;
import java.util.Map;

class Operations {


  final static Map<String,Operator> operators = new HashMap<>();
  static {
    operators.put("*",stack -> {
      Double operandOne = stack.pop();
      Double operandTwo = stack.pop();
      stack.push(operandOne * operandTwo);
    });
    operators.put("/",stack ->{
      Double operandOne = stack.pop();
      Double operandTwo = stack.pop();
      stack.push(operandTwo / operandOne);
    });
    operators.put("-",stack -> {
      Double operandOne = stack.pop();
      Double operandTwo = stack.pop();
      stack.push(operandTwo - operandOne);
    });
    operators.put("+", stack -> {
      Double operandOne = stack.pop();
      Double operandTwo = stack.pop();
      stack.push(operandOne + operandTwo);
    });
    operators.put("sqrt",stack -> {
      Double operandOne = stack.pop();
      stack.push(Math.sqrt(operandOne));
    });
    operators.put("^",stack -> {
      Double operandOne = stack.pop();
      Double operandTwo = stack.pop();
      stack.push(Math.pow(operandTwo, operandOne));
    });
  }

}
