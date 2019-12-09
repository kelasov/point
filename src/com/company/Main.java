package com.company;

public class Main {

    public static void main(String[] args)  {
    Figure f=new Figure(3);
    try {
        System.out.println("Работаю с первой точкой");
        f.setCoord(0,0,0);
        System.out.println("Работаю с второй точкой");
        f.setCoord(1,10,0);
        System.out.println("Работаю с третьей точкой");
        f.setCoord(2,10,10);
        System.out.println("Работаю с четвертой точкой");
        f.setCoord(3,0,10);
        System.out.println("Всё!");
    }
        catch (PointIndexException e){
        System.out.println(e.getMessage()+":"+e.getIndex());
        }
    }
}
