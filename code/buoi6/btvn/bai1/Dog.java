package buoi6.btvn.bai1;

import java.util.Scanner;

public class Dog extends Animal {
    Scanner s = new Scanner(System.in);
    
    private String character;

    public Dog () {

    }

    public Dog(String name, Byte age, Float weight, String character) {
        super(name, age, weight);
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
    
    @Override
    public void input(){
        super.input();
        System.out.print("Character ? ");
        character = s.nextLine();
    }

    @Override
    public void output(){
        super.output();
        System.out.println("Character : " + character);
    }

    @Override
    public void tiengKeu (){
        super.tiengKeu();
        System.out.println("Uh woof woof!!");
    }
}
