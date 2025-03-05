package com.example.autowire.Java8;

@FunctionalInterface
public interface MyIntreface {
    public abstract void show();

    default void callPrivateMethod() {
        System.out.println("call....");
        privateMethod();
    }

    public static void staticMethod() {
        System.out.println("static method inrefec...");
    }

    private void privateMethod() {
        System.out.println("private method...");
    }

}
