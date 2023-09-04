package buoi6.btvn.bai1;

import java.util.Scanner;

public class Cat extends Animal{
    Scanner s = new Scanner(System.in);

    private String color;
    private String preferences;
    private String ownerName;
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getPreferences() {
        return preferences;
    }
    
    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }
    
    public String getOwnerName() {
        return ownerName;
    }
    
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Cat(String name, Byte age, Float weight, String color, String preferences, String ownerName) {
        super(name, age, weight);
        this.color = color;
        this.preferences = preferences;
        this.ownerName = ownerName;
    }
    public Cat() {
        
    }

    @Override 
    public void input(){
        super.input();
        System.out.print("Color ? ");
        color = s.nextLine();
        System.out.print("Preferences ? ");
        preferences = s.nextLine();
        System.out.print("Owner's name ? ");
        ownerName = s.nextLine();
    }

    @Override
    public void output(){
        super.output();
        System.out.println("Color : " + color);
        System.out.println("Preferences : " + preferences);
        System.out.println("Owner's name : " + ownerName);
    }

    @Override
    public void tiengKeu(){
        super.tiengKeu();
        System.out.println("meow meow!!");
    }
}
