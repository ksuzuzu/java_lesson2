package com.company;

public class Animal {
   String type;
    String name;
    Short age;
    String color;
    Short weight;

    public void eat (){
        System.out.println("Я ем");
    }
    public void sleep (){
        System.out.println("Я сплю");
    }
    public void sayName (){
        System.out.println(name);
    }
    public void sayAge(){
        System.out.println(age);
    }
    public void sayColor(){
        System.out.println(color);
    }
}
