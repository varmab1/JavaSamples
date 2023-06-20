package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrays {

    public static void removeLastElement(ArrayList<String> rm){
        rm.remove(rm.size()-1);
        System.out.println(rm);

    }

    public static void main(String[] args) {
        ArrayList<String> lis=new ArrayList<>();
        lis.add("a1");
        lis.add("a2");
        lis.add("a3");
        lis.add("a4");
        lis.add("a5");
        lis.add("a6");

        for(int i=0;i<lis.size();i++)
            System.out.print(lis.get(i)+" ");

        System.out.println();

        for(String s:lis)
            System.out.print(s+" ");

        System.out.println();

        Iterator<String> it=lis.iterator();
        while(it.hasNext())
            System.out.print(it.next()+" ");

        System.out.println();

        lis.forEach( s -> System.out.print(s+" "));

        System.out.println();

        lis.stream().parallel().forEach(s -> System.out.print(s+" "));

        System.out.println("\nRemoving Last Element");

        removeLastElement(lis);

        System.out.println("ArrayList to array");

        String[] strs = lis.toArray(new String[0]);

        for(String s:strs)
            System.out.print(s+" ");


        System.out.println("\nFiltering Students ArrayList");

        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("a","z",3.9));
        students.add(new Student("b","y",3.8));
        students.add(new Student("c","x",3.7));
        students.add(new Student("d","v",3.4));
        students.add(new Student("e","u",3.3));
        students.add(new Student("f","t",3.2));

        double average = students.stream()
                .mapToDouble(s -> s.GPA)
                .average().getAsDouble();
        System.out.println("Average is "+average);
        students.stream().filter(s->s.GPA>average).forEach(s->System.out.println(s.toString()));



    }

}
