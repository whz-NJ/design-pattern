package com.migu.pattern.interpretor.alarm;

import java.util.Map;

public interface Expression {
  boolean interpret(Map<String, Long> stats);
}
