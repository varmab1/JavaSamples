package com.assignment5;

import java.util.ArrayList;

public class Assignment5 {
    ArrayList<Integer> fibonacciSeries(int n){
        ArrayList<Integer> res=new ArrayList<>();
        res.add(0);
        res.add(1);
        if(n<=2){
            return new ArrayList<>(res.subList(0,n));
        }
        for(int i=2;i<n;i++){
            res.add(res.get(i - 1) + res.get(i - 2));
        }
        return res;
    }

    String timeOfLife(int age){
        if(age<0){
            return "Wrong input";
        }else if(13<=age && age<=19){
            return "teen";
        }else if(age<13){
            return "kid";
        }else{
            return "adult";
        }
    }
    int reverse(int nums){
        int res=0,i=0;

        while(nums!=0){
            int t=nums%10;
            res=res*10+t;
            i=i+1;
            nums=nums/10;
        }
        return res;
    }
    void fizzBizz() {
        for (int i = 1; i <= 100; i++) {
            String s = i + " ";
            if (i % 3 == 0)
                s += "Fizz";
            if (i % 5 == 0)
                s += "Buzz";
            System.out.println(s);

        }
    }

    public static void main(String[] args) {

        Assignment5 Ob=new Assignment5();
        System.out.println(Ob.reverse(1234));
        System.out.println(Ob.reverse(100));
        System.out.println(Ob.reverse(0));
        System.out.println();
        System.out.println(Ob.timeOfLife(0));
        System.out.println(Ob.timeOfLife(19));
        System.out.println(Ob.timeOfLife(20));
        System.out.println();
        System.out.println(Ob.fibonacciSeries(10));
        System.out.println(Ob.fibonacciSeries(2));
        System.out.println(Ob.fibonacciSeries(1));
        System.out.println();
        Ob.fizzBizz();

    }

}
