package com.migu.pattern.proxy.cglib;

/**
 *
 */
public class Test {

    public static void main(String[] args) {

        try {
//            ZhangSan obj = (ZhangSan)new CglibMeipo().getInstance(ZhangSan.class);
//            obj.findLove();
//            System.out.println("--------------------------------");
//            System.out.println(obj.toString());
            ZhangSan obj2 = new ZhangSan();
            obj2.name = "zhangshan";
            ZhangSan proxy = (ZhangSan)new CglibMeipo().getProxy(obj2);
            // proxy.findLove();
            System.out.println(proxy);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}