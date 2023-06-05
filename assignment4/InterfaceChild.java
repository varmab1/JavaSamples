package com.assignment4;

public class InterfaceChild implements Interface1, Interface2{

    @Override
    public void method1() {
        System.out.println("Method1 Implemented");
    }

    @Override
    public void method2() {
        System.out.println("Method2 Implemented");

    }

    public static void main(String[] args) {
        InterfaceChild Ob=new InterfaceChild();
        Ob.method1();
        Ob.method2();
    }
}
