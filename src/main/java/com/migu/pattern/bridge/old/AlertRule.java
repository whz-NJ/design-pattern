package com.migu.pattern.bridge.old;

/**
 * @author whz
 * @create 2020-12-09 11:01
 * @desc TODO: add description here
 **/
public class AlertRule {
  public AlertRule getMatchedRule(String api) {
    return this;
  }
  private long maxErrorCount;

  private long maxTps;

  public long getMaxErrorCount() {
    return maxErrorCount;
  }

  public void setMaxErrorCount(long maxErrorCount) {
    this.maxErrorCount = maxErrorCount;
  }

  public long getMaxTps() {
    return maxTps;
  }

  public void setMaxTps(long maxTps) {
    this.maxTps = maxTps;
  }
}