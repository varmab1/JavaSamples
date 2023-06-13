package com.exceptions;

public class Main {

    int toInteger(String s){
        int x=0;
        try{
            x=Integer.parseInt(s);
        }catch(Exception e){
            e.printStackTrace();
        }
        return x;
    }


    public static void main(String[] args) {
        Main ob=new Main();
        System.out.println(ob.toInteger("23"));
        System.out.println(ob.toInteger("45.67"));
        System.out.println(ob.toInteger("test"));
        System.out.println(ob.toInteger("123f"));
    }
}
