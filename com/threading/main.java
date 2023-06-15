package com.threading;

public class main {

    public static void main(String[] args) {
        SmaplethreadInterface ob=new SmaplethreadInterface();
        SampleThreads ob1=new SampleThreads();
        ob1.start();
        Thread t1=new Thread(ob);
        t1.start();
    }

}
