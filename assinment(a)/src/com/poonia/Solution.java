package com.poonia;

public class Solution {
    public String compress1(String str){

        String ans="";


        for(int i=0;i<str.length()-1;i++ ){
            int rep=1;

            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ){   //aaabbb
               rep++;
               i++;

            }
            ans=ans+str.charAt(i)+rep;

        }

        return ans;
    }
    public String compress2(String str){
        //base case
        if(str.length()==2){
            return str;
        }
        String ans="";
        int i=0;
        int temp=Character.getNumericValue(str.charAt(1));

        while(i<str.length()-1){

            while( i<str.length()-1 && temp==Character.getNumericValue(str.charAt(i+1))){
                ans=ans+str.charAt(i);
                i+=2;
            }
            ans=ans+temp;
           // System.out.println("ans:"+ans);
            if(i<str.length())
            temp=Character.getNumericValue(str.charAt(i+1));  //a1b2
        }

        return ans;
    }
    public String decompress(String str){
       String ans="";
       int i=0;
       while(i<str.length()-1){
         int start=i;
         while(Character.isAlphabetic(str.charAt(i))){
             i++;
         }
         while(start<i){
             for(int j=0;j<Character.getNumericValue(str.charAt(i));j++){
                 ans=ans+str.charAt(start);
             }
             start++;
         }


         i++;
       }

       return ans;
    }
}
