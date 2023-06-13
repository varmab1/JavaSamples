package com.exceptions;

public class CustomExceptionExample {

    int checkNumber(int e) throws NegativeNumberException{
        if(e<0){
            throw new NegativeNumberException(e+" is a negative Number");
        }
        return e;
    }

    public static void main(String[] args){
        try {
            CustomExceptionExample ob = new CustomExceptionExample();
            System.out.println(ob.checkNumber(4));
            System.out.println(ob.checkNumber(-5));
            System.out.println(ob.checkNumber(-100));
            System.out.println(ob.checkNumber(8));
        } catch (NegativeNumberException e){
            e.printStackTrace();
        }
    }
}
