package com.assignment4;

public class StaticExample {
    static int variable;
    static {
        StaticExample.setVariable(50);
        System.out.println(getVariable());
    }
    static int getVariable(){
        return StaticExample.variable;
    }
    static void setVariable(int variable){
        StaticExample.variable=variable;
    }

    public static void main(String[] args) {
        //StaticExample Ob=new StaticExample();
    }
}
