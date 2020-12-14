package com.migu.pattern.state.statepattern;

/**
 * @author whz
 * @create 2020-12-07 13:38
 * @desc TODO: add description here
 **/
public class CapeMario implements IMario {
  private MarioStateMachine stateMachine;

  public CapeMario(MarioStateMachine stateMachine) {
    this.stateMachine = stateMachine;
  }

  @Override
  public State getName() {
      return State.CAPE;
  }

  @Override
    public void obtainMushRoom() {
      // do nothing...
  }

  @Override public void obtainCape() {
      // do nothing...
  }

  @Override public void obtainFireFlower() {
    // do nothing...
  }

  @Override public void meetMonster() {
    stateMachine.setCurrentState(new SmallMario(stateMachine));
    stateMachine.setScore(stateMachine.getScore() - 200);
  }
}
