package edu.cnm.deepdive.calculator;

import java.util.Arrays;

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

}
