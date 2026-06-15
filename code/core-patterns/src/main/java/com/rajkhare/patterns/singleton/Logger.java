package com.rajkhare.patterns.singleton;

public class Logger implements Cloneable{

    private static volatile Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if(instance == null) {
            synchronized (DateUtil.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton cannot be cloned");
    }
}
