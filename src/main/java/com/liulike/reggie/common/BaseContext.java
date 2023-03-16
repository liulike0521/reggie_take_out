package com.liulike.reggie.common;

/**
 * 基于ThreadLocal的工具类，用于获取和保存当前用户ID
 */
public class BaseContext {
    public static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentID(Long id){
        threadLocal.set(id);
    }

    public static Long getCurrentID(){
        return threadLocal.get();
    }
}
