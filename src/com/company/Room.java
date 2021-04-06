package com.company;

public class Room {
    int length;
    int width;
    int height;
    String type;
    Boolean decoration;


    public Room(int length, int width,int height,String type,boolean decoration ){
        this.length = length;
        this.width=width;
        this.height=height;
        this.type= type;
        this.decoration = decoration;

    }
    void calculateArea (){
        int area = length * width;
        System.out.println(area);


    }
    void speakType (){
        System.out.println("Тип " + type);
    }
    void speakAboutDecoration(){
        System.out.println("Отделка  "+ decoration);
    }
    void speakHeight(){
        System.out.println("Высота потолка " + height);
    }
    void calculateVolume (){
        int volume = length*width*height;
        System.out.println(volume);
    }

}
