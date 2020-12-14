package com.migu.pattern.decorator;

import com.migu.pattern.decorator.old.SigninService;
import com.migu.pattern.decorator.upgrade.ISigninForThirdService;
import com.migu.pattern.decorator.upgrade.SigninForThirdService;

/**
 * @author whz
 * @create 2020-12-04 15:22
 * @desc TODO: add description here
 **/
public class Test {
  public static void main(String[] args) {

    //原来的功能依旧对外开放，依旧保留
    //新的功能同样的也可以使用
    ISigninForThirdService signinForThirdService = new SigninForThirdService(new SigninService());
    signinForThirdService.loginForQQ("xxssdsd");

  }
}