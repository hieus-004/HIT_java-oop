package buoi6.on;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person (){

    }

    public Person (String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName (){
        return name;
    }

    public int getAge (){
        return age;
    }

    public String getAddress (){
        return address;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setAge (int age){
        this.age = age;
    }

    public void setAddress (String address){
        this.address = address;
    }

    public void display (){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Address : " + address);
    }

    public void input (){
        Scanner s = new Scanner(System.in);

        System.out.print("Name : ");
        name = s.nextLine();
        System.out.print("Age ");
        age = s.nextInt();
        System.out.print("Address : ");
        address = s.nextLine();
    }
}
