package com.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetsSamples {

    public static void main(String[] args) {

        Set<String> se=new HashSet<>();
        se.add("a1");
        se.add("a2");
        se.add("a3");
        se.add("a4");
        se.add("a5");
        se.add("a6");

        for(String s:se)
            System.out.print(s+" ");

        System.out.println("");

        se.forEach((s) -> System.out.print(s+" "));

        System.out.println("");

        se.stream().forEach((s) -> System.out.print(s+" "));

        System.out.println("");

        Iterator<String> it= se.iterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");

        System.out.println("");

        String s="aabbccddee";
        String s1="";
        Set<Character> cSet=new HashSet<>();
        for(int i=0;i<s.length();i++) {
            if (!cSet.contains(s.charAt(i))){
                cSet.add(s.charAt(i));
                s1+=s.charAt(i);
            }
        }
        System.out.println(s1);

    }
}
