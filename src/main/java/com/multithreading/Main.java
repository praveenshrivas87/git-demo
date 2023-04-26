package com.multithreading;

public class Main {

    public void addData(String data){
        System.out.println("Data = "+ data);

        if(data.contains(Constant.DATA_TYPE)){
            System.out.println("Welcome");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}