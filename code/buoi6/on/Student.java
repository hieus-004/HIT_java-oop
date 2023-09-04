package buoi6.on;

import java.util.Scanner;

public class Student extends Person{
    private double gpa;

    public Student (){

    }

    public Student (String name, int age, String address, double gpa){
        super(name, age, address);
        this.gpa = gpa;
    }

    public void setGpa (double gpa){
        this.gpa = gpa;
    }

    public double getGpa (){
        return gpa;
    }

    @Override
    public void display (){
        super.display();
        System.out.println("GPA : " + gpa);
    }

    @Override
    public void input (){
        super.input();
        Scanner s = new Scanner(System.in);
        System.out.print("GPA : ");
        gpa = s.nextDouble();
    }
}
