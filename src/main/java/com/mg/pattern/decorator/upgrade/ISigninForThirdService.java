package com.mg.pattern.decorator.upgrade;

import com.mg.pattern.decorator.old.ISigninService;
import com.mg.pattern.decorator.old.ResultMsg;

public interface ISigninForThirdService extends ISigninService {
    public ResultMsg loginForQQ(String openId);
    public ResultMsg loginForWechat(String openId);
    public ResultMsg loginForToken(String token);
    public ResultMsg loginForTelphone(String telphone,String code);
    public ResultMsg loginForRegist(String username,String password);
}