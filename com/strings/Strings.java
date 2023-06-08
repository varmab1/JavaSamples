package com.strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Strings {


    int getNumberOfVowels(String s) {
        final String vowels = "aeiou";
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) > -1) {
                res += 1;
            }
        }
        return res;
    }

    String reverse(String str,int i, int j){
        StringBuilder sb = new StringBuilder(str);

        while(i<j){
            sb.setCharAt(i, str.charAt(j));
            sb.setCharAt(j, str.charAt(i));
            i++;
            j--;
        }
        return sb.toString();
    }

    boolean checkAnagram(String s1,String s2){
        int[] sMap=new int[26];
        for(int i=0;i<s1.length();i++){
            sMap[(int) s1.charAt(i)-97]=sMap[(int) s1.charAt(i)-97]+1;
        }
        for(int i=0;i<s2.length();i++){
            sMap[(int) s1.charAt(i)-97]=sMap[(int) s1.charAt(i)-97]-1;
        }
        for(int i=0;i<26;i++){
            if(sMap[i]!=0){
                return false;
            }
        }
        return true;
    }

    boolean checkReverse(String s1,String s2){
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(s2.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    boolean checkRotation(String s1,String s2){
        int i=0,j=0;
        while(i<s1.length() && j!=-1){
            j=s1.indexOf(s2.charAt(0),i);
            //System.out.println(j+" "+this.rotation(s1,j));
            if(j!=-1 && this.rotation(s1,j).equals(s2))
                return true;
            i=j+1;
        }
        return false;
    }

    String rotation(String arr,int x){
        String res="";
        for(int i=0;i<arr.length();i++){
            res+=arr.charAt((x+i)%arr.length());
        }
        return res;
    }
    String reverseWordsInASentence(String s){
        int i=0;
        while(i<s.length()){
            int j=s.indexOf(" ",i);

            if(j==-1){
                j=s.length();
            }
            s=this.reverse(s,i,j-1);
            i=j+1;
        }
        return s;
    }


    void sortStudentData(){
        String line = "";
        String splitBy = ",";
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("./src/com/strings/student.csv"));
            Student[] studentsArray= new Student[10];
            int i=0;
            while ((line = br.readLine()) != null)
            {
                String[] student = line.split(splitBy);
                studentsArray[i]=new Student(student[0],student[1],Float.parseFloat((student[2])));
                i+=1;
            }
            Arrays.sort(studentsArray);
            for (i = 0; i < studentsArray.length; i++) {
                System.out.println(studentsArray[i].LastName+" "+studentsArray[i].FirstName+" "+studentsArray[i].GPA);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        Strings ob=new Strings();
        System.out.println("Finding Number of Vowels");
        System.out.println(ob.getNumberOfVowels("aeiou"));
        System.out.println(ob.getNumberOfVowels("qqqqiiikkkk"));
        System.out.println("\nFinding Anagrams");
        System.out.println(ob.checkAnagram("",""));
        System.out.println(ob.checkAnagram("abcc","acbc"));
        System.out.println(ob.checkAnagram("abxcc","acbc"));
        System.out.println("\nReversing words in a sentence");
        System.out.println(ob.reverseWordsInASentence("Java J2EE Reverse Me"));
        System.out.println(ob.reverseWordsInASentence("I am Dell"));
        System.out.println("\nChecking Reverse Strings");
        System.out.println(ob.checkRotation("madamImAdam","madamImAdam"));
        System.out.println(ob.checkRotation("JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee"));
        System.out.println("\nImplementing Comparable Interface");
        ob.sortStudentData();
    }
}
