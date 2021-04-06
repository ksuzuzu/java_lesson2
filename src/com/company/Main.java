package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Room room= new Room(1,2,1,"Кухня",true);
        Giraffe giraffe = new Giraffe();
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Что вы хотите посмотреть");
        System.out.println("Введите: '1' - жираф '2' - человек '3' - комната");
        int choice =scanner.nextInt();
        switch (choice){
            case 1:
                giraffe.sleep();
                giraffe.eat();
                giraffe.sayName();
                giraffe.sayAge();
                break;
            case 2:
                person.sayAge();
                person.sayName();
                person.ageBeforeRetirement();
                person.calculateBirthdayYear();
                person.calculateCalories();
                break;
            case 3:
                room.calculateArea();
                room.calculateVolume();
                room.speakAboutDecoration();
                room.speakHeight();
                room.speakType();

        }
    }

}
