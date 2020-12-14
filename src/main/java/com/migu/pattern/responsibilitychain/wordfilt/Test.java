package com.migu.pattern.responsibilitychain.wordfilt;

/**
 * @author whz
 * @create 2020-12-07 17:08
 * @desc 测试用例
 **/
public class Test {
  public static void main(String[] args) {
    SensitiveWordFilterChain filterChain = new SensitiveWordFilterChain();
    filterChain.addFilter(new AdsWordFilter());
    filterChain.addFilter(new SexyWordFilter());
    filterChain.addFilter(new PoliticalWordFilter());

    boolean legal = filterChain.filter(new Content());
    if (!legal) {
      // 不发表
    } else {
      // 发表
    }
  }

}
