package com.mg.pattern.responsibilitychain.wordfilt;

/**
 * @author whz
 * @create 2020-12-07 17:08
 * @desc TODO: add description here
 **/
public class PoliticalWordFilter implements SensitiveWordFilter  {
  @Override
  public boolean doFilter(Content content) {
    boolean legal = true;
    //...
    return legal;
  }
}