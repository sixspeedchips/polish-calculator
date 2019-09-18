package edu.cnm.deepdive.calculator;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

  public static void main(String[] args) {


    System.out.println(ReversePolishCalculator.calculate("1 1 +"));
    System.out.println(ReversePolishCalculator.calculate("1 1 -"));
    System.out.println(ReversePolishCalculator.calculate("15 7 1 1 + - / 3 * 2 1 1 + + -"));
    System.out.println(ReversePolishCalculator.calculate("3 1 2 + *"));
    System.out.println(ReversePolishCalculator.calculate("4 2 5 * + 1 3 2 * + /"));

  }

}
