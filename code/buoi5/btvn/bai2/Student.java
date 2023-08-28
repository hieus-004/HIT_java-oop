package buoi5.btvn.bai2;

import java.util.Scanner;

public class Student {
    private String Name;
    private String Class;
    private double Score;
    private Faculty y = new Faculty();

    public Student (){

    }

    public Student (String Name, String Class, double Score, Faculty y){
        this.Name = Name;
        this.Class = Class;
        this.Score = Score;
        this.y = y;
    }

    public void Input (){
        System.out.println("Input");
        Scanner s = new Scanner(System.in);

        System.out.print("Name of student : ");
        Name = s.nextLine();
        System.out.print("Name of class : ");
        Class = s.nextLine();
        System.out.print("Score : ");
        Score = s.nextDouble();
        y.Input();
    }

    public void Output (){
        System.out.println("\nOutput");
        System.out.println("Name of student : " + Name);
        System.out.println("Class : " + Class);
        System.out.println("Score : " + Score);
        y.Output();
    }
}
