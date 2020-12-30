package com.mg.pattern.decorator.old;

public interface ISigninService {
    public ResultMsg regist(String username,String password);
    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password);
}
