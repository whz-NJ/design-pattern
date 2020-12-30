package com.mg.pattern.state.branchmethod;

/**
 * @author whz
 * @create 2020-12-07 13:33
 * @desc TODO: add description here
 **/
public class Test {
  public static void main(String[] args) {
    MarioStateMachine mario = new MarioStateMachine();
    mario.obtainMushRoom();
    int score = mario.getScore();
    State state = mario.getCurrentState();
    System.out.println("mario score: " + score + "; state: " + state);
  }

}
