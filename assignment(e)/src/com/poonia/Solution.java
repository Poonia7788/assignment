package com.poonia;

public class Solution {
    public String maxNumber(String str){
        String ans="";
        int min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<str.length();i++){
            if(Character.getNumericValue(str.charAt(i))<min){
                min=Character.getNumericValue(str.charAt(i));
                index=i;
            }
        }
        for(int i=0;i<str.length();i++){
            if(i!=index){
                ans=ans+str.charAt(i);
            }
        }

        return ans;
    }
}
