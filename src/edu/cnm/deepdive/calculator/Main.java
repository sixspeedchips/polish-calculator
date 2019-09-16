package edu.cnm.deepdive.calculator;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {


    Calculator calculator = new ReversePolishCalculator();
    calculator.calculate("1 1 +");
//    calculator.calculate("4 1 +");
//    calculator.calculate("1 -70 +");
//    calculator.calculate("7 1 +");
//    calculator.calculate("99 1 +");
//    calculator.calculate("10 1 +");
//    calculator.calculate("1 10 +");
//    calculator.calculate("-5 12 +");
  }

}
