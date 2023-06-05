package com.assignment4;

public class Child extends Parent{
    int CVariable;
    Child(int PVariable,int CVariable){
        super(PVariable);
        this.CVariable=CVariable;
    }

    Child(int CVariable){
        this.CVariable=CVariable;
    }

    public static void main(String[] args) {
        Child Ob=new Child(1);
        Child Ob1=new Child(1,2);
        System.out.println(Ob.CVariable+" "+Ob.Pvariable);
        System.out.println(Ob1.CVariable+" "+Ob1.Pvariable);

    }
}
