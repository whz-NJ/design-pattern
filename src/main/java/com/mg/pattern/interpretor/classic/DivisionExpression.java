package com.mg.pattern.interpretor.classic;

/**
 * @author whz
 * @create 2020-12-21 15:55
 * @desc TODO: add description here
 **/
public class DivisionExpression implements Expression {
  private Expression exp1;
  private Expression exp2;

  public DivisionExpression(Expression exp1, Expression exp2) {
    this.exp1 = exp1;
    this.exp2 = exp2;
  }

  @Override
  public long interpret() {
    return exp1.interpret() / exp2.interpret();
  }
}
