package com.company;

public class Class {
    private int number;
    private String word;
    private int[] arrNumber;


    public Class(int number , String word , int[] arrNumber){
        this.number = number;
        this.word = word;
        this.arrNumber = arrNumber;
        
        
         System.out.print(number + "  " + word + " ");
       for (int arg: arrNumber) {
       System.out.print(arg + " ");
       }   
    }
}
