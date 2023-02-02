package class10;

import java.util.Scanner;

public class Dog {
    String name;
    String breed;
    int age;
    double weight;
    String color;
    void bark(){
        System.out.println("Woof woof");
    } void sleep(){
        System.out.println("ZZZZZZzzzzzzzZZZZZZZ");
    }void eat(){
        System.out.println("Dog is eating..........");
    }void forloop(){
        Scanner input2=new Scanner(System.in);
        System.out.println("How gay is jamy?");
        int x= input2.nextInt();
        for (int i=0; i<x;i++){
            System.out.print("Very ");
        }
        System.out.print("Gay");
    }
}
