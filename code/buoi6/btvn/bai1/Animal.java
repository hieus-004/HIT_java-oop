package buoi6.btvn.bai1;

import java.util.Scanner;

public class Animal {
    Scanner s = new Scanner(System.in);
    
    private String name;
    private Byte age;
    private Float weight;
    
    public Animal(String name, Byte age, Float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Animal (){

    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }    

    public Byte getAge() {
        return age;
    }
    public void setAge(Byte age) {
        this.age = age;
    }

    public Float getWeight() {
        return weight;
    }
    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public void input(){
        System.out.print("Name ? ");
        name = s.nextLine();
        System.out.print("Age ? ");
        age = s.nextByte();
        System.out.print("Weight ? ");
        weight = s.nextFloat();
    }

    public void output(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Weight : " + weight);
    }

    public void tiengKeu(){
        System.out.print("Tieng keu : ");
    }
}
