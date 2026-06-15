package com.rajkhare.patterns.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {

    private static volatile DateUtil instance;

    private DateUtil() {
    }

    public static DateUtil getInstance() {
        if(instance == null) {
            synchronized (DateUtil.class) {
                if (instance == null) {
                    instance = new DateUtil();
                }
            }
        }
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return instance;
    }
}
