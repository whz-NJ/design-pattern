package com.migu.pattern.responsibilitychain.wordfilt;

/**
 * @author whz
 * @create 2020-12-07 17:09
 * @desc TODO: add description here
 **/
public class AdsWordFilter implements SensitiveWordFilter {
  @Override public boolean doFilter(Content content) {
    boolean legal = true;
    //...
    return legal;
  }
}
