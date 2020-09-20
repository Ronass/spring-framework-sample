package org.matrix.spring.aop.operation;

import javax.xml.ws.soap.Addressing;

/**
 * 假设的用户登陆
 * @author matrix
 * @datetime 2020/9/20 23:36
 */
public class UserContentHolder {

    private static String cacheName = "";

    /**
     * 设置缓存用户
     * @param name
     */
    public static void setCache(String name) {
        cacheName = name;
    }

    /**
     * 当前是谁
     * @return
     */
    public static void whois() {
        System.err.println("当前缓存用户：" + cacheName);
    }


    /**
     * 当前是谁
     * @return
     */
    public static String whoIsName() {
        return cacheName;
    }

}
