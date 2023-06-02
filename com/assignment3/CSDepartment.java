package com.assignment3;

public class CSDepartment extends Department{

    @Override
    int getDepartmenSize() {
        return 120;
    }

    @Override
    public String getDeparmentHead(){
        return "Sanjeev";
    }

    public static void main(String[] args) {
        Department ob=new CSDepartment();
        System.out.println(ob.getDeparmentHead());
        System.out.println(ob.getDepartmenSize());

    }
}
