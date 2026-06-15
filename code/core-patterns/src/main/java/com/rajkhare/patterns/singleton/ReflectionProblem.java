package com.rajkhare.patterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionProblem {

    static void main() {
        DateUtil instance1 = DateUtil.getInstance();
        DateUtil instance2 = null;

        Constructor[] constructors = DateUtil.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            try {
                instance2 = (DateUtil) constructor.newInstance();
                break;
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}
