package com.poonia;

public class Main {


    public static void main(String[] args) {
	    String str="aabbcaaaccc";
        Solution ob=new Solution();

        String ans=ob.compress1(str);
        System.out.println("First compressed String:"+ans);
        String ans2=ob.compress2(ans);
        System.out.println("Second compressed String:"+ans2);
        String ans3=ob.decompress(ans2);
        System.out.println("Decompressed:"+ans3);
    }
}
