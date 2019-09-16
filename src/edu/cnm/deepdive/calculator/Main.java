package edu.cnm.deepdive.calculator;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {


    Calculator calculator = new ReversePolishCalculator();
    calculator.calculate("1 1 +");


  }

}
