package com.multithreading;

public class Main {

    public void addData(String data){
        System.out.println("Data = "+ data);

        if(data.contains("Java Expert")){
            System.out.println("Welcome");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}