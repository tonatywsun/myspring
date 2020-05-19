package com.yang.conf;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/05/19 17:12
 */
public class MyLog implements org.apache.ibatis.logging.Log {
    public MyLog(String clazz) {
    }

    @Override
    public boolean isDebugEnabled() {
        return true;
    }

    @Override
    public boolean isTraceEnabled() {
        return true;
    }

    @Override
    public void error(String s, Throwable e) {
        System.out.println("error my log->" + s);
    }

    @Override
    public void error(String s) {
        System.out.println("error my log->" + s);
    }

    @Override
    public void debug(String s) {
        System.out.println("debug my log->" + s);
    }

    @Override
    public void trace(String s) {
        System.out.println("trace my log->" + s);
    }

    @Override
    public void warn(String s) {
        System.out.println("warn my log->" + s);
    }
}
