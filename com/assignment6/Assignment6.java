package com.assignment6;

import com.assignment5.Assignment5;

public class Assignment6 {

    int[] reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }

    int[] getMaxMin(int[] arr){
        int maximumElement=Integer.MIN_VALUE,minimumElement=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] < minimumElement) {
                minimumElement = arr[i];
            }
            if (arr[i] > maximumElement) {
                maximumElement = arr[i];
            }
        }
        return new int[]{maximumElement,minimumElement};
    }



    int[] rotation(int[] arr,int x){
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=arr[(x+i)%arr.length];
        }
        return res;
    }

    void display(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("");
    }


    public static void main(String[] args) {
        Assignment6 ob=new Assignment6();
        System.out.println("MinMax");
        ob.display(ob.getMaxMin(new int[]{1, -1000, 3, 4, 5, 6, 22222, 8}));
        ob.display(ob.getMaxMin(new int[]{1, 2, 3, 4, 2005, 6, 7, 8}));
        System.out.println("");
        System.out.println("Reverse");
        ob.display(ob.reverse(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        System.out.println("");
        System.out.println("Rotation");
        ob.display(ob.rotation(new int[]{1, 2, 3, 4, 5, 6, 7, 8},2));
        ob.display(ob.rotation(new int[]{1, 2, 3, 4, 5, 6, 7, 8},8));
    }
}
