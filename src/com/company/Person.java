package com.company;

public class Person implements Info{
    String name;
    String surname;
    int age;
    int height;
    int weight;

    void sayName(){
        System.out.println("Меня зовут: "+ name + " " + surname);
    }
    void ageBeforeRetirement (){
        int ages = 65-age;
        System.out.println(ages);
    }
    void calculateCalories(){
       int calculate = (int) (655.1 +( 9.6 * weight)-(1.85*height)-(4.68*age));
    }
    void calculateBirthdayYear (){
        int birthday = 2021 - age;
        System.out.println(birthday);
    }
    void sayAge(){
        System.out.println(" Возраст "+ age);
    }

    public int getAge() {
        return age;
    }

     public void showInfo (){
         System.out.println("Вхожу в дом ");
         System.out.println( "Глажу жирафа ");
    }
}
