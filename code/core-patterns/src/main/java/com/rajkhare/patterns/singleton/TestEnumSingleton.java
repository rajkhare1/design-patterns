package com.rajkhare.patterns.singleton;

public class TestEnumSingleton {

    static void main() {
        EnumSingletonDemo instance = EnumSingletonDemo.INSTANCE;
        System.out.println(instance.getName());
        instance.setName("Raj");
        System.out.println(instance.getName());
    }

}
