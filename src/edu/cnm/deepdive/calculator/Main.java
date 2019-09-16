package edu.cnm.deepdive.calculator;

public class Main {

  public static void main(String[] args) {


    Calculator calculator = new ReversePolishCalculator();
    calculator.calculate("1 1 +");

  }

}
