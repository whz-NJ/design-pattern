package com.migu.pattern.prototype.deep;

/**
 * @author whz
 * @create 2020-12-04 16:30
 * @desc TODO: add description here
 **/
public class Test {
  public static void main(String[] args) {

    QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
    try {
      QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();
      System.out.println("深克隆：" + (qiTianDaSheng.jinGuBang == clone.jinGuBang));
    }
    catch (Exception e) {
      e.printStackTrace();
    }

    QiTianDaSheng q = new QiTianDaSheng();
    QiTianDaSheng n = q.shallowClone(q);
    System.out.println("浅克隆：" + (q.jinGuBang == n.jinGuBang));

  }
}