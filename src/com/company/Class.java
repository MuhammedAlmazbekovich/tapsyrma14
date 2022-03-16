package com.company;

public class Class {
    private int number;
    private String word;
    private int[] arrNumber;


    public Class(int number , String word , int[] arrNumber){
        this.number = number;
        this.word = word;
        this.arrNumber = arrNumber;
    }

    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public  void setWord(String word){
        this.word = word;
    }
    public String getWord(){
        return word;
    }
    public void setArrNumber(int[] arrNumber){
        this.arrNumber = arrNumber;
    }
    public int[] getArrNumber(int i){
        return arrNumber;
    }
}
