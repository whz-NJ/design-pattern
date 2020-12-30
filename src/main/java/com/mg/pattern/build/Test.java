package com.mg.pattern.build;

/**
 * @author whz
 * @create 2020-12-09 7:48
 * @desc TODO: add description here
 **/
public class Test {
  public static void main(String[] args) {
    // 这段代码会抛出IllegalArgumentException，因为minIdle>maxIdle
    ResourcePoolConfig config = new ResourcePoolConfig.Builder()
        .setName("dbconnectionpool")
        .setMaxTotal(16)
        .setMaxIdle(10)
        .setMinIdle(12)
        .build();
  }
}