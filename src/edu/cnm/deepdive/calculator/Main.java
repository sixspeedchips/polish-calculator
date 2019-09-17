package edu.cnm.deepdive.calculator;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

  public static void main(String[] args) {


    Calculator calculator = new ReversePolishCalculator();
    System.out.println(calculator.calculate("1 1 +"));
    System.out.println(calculator.calculate("1 1 -"));
    System.out.println(calculator.calculate("15 7 1 1 + - / 3 * 2 1 1 + + -"));

  }

}
