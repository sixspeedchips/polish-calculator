package edu.cnm.deepdive.calculator;

import java.util.LinkedList;
import java.util.Stack;

interface Operator {

  void operate(LinkedList<Double> stack);
}
