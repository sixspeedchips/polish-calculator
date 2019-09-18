package edu.cnm.deepdive.calculator;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Operations {


  final static Map<String,Operator> operators = new HashMap<>();
  static {
    operators.put("*", Multiply.instance());
    operators.put("+", Add.instance());
    operators.put("-", Subtract.instance());
    operators.put("/", Divide.instance());
  }


  static class Multiply implements Operator {

    private Multiply(){
    }
    @Override
    public void operate(LinkedList<Double> stack) {
      Double operandOne = stack.pop();
      Double operandTwo = stack.pop();
      stack.push(operandOne * operandTwo);
    }

    static Multiply instance(){
      return new Multiply();
    }

  }

  static class Divide implements Operator{

    private Divide() {
    }

    @Override
    public void operate(LinkedList<Double> stack) {
      Double operandOne = stack.pop();
      Double operandTwo = stack.pop();

      stack.push(operandTwo / operandOne);
    }
    static Divide instance(){
      return new Divide();
    }
  }

  static class Add implements Operator{

    @Override
    public void operate(LinkedList<Double> stack) {
      Double operandOne = stack.pop();
      Double operandTwo = stack.pop();
      stack.push(operandOne + operandTwo);
    }
    static Add instance(){
      return new Add();
    }
  }

  static class Subtract implements Operator{

    @Override
    public void operate(LinkedList<Double> stack) {
      Double operandOne = stack.pop();
      Double operandTwo = stack.pop();
      stack.push(operandTwo - operandOne);
    }

    static Subtract instance(){
      return new Subtract();
    }
  }
}
