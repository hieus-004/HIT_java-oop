package buoi6.on;

import java.util.Scanner;

public class Teacher extends Person{
    private int salary;

    public Teacher (){

    }

    public Teacher (String name, int age, String address, int salary){
        super(name, age, address);
        this.salary = salary;
    }

    public void setSalary (int salary){
        this.salary = salary;
    }

    public int getSalary (){
        return salary;
    }

    @Override
    public void display (){
        super.display();
        System.out.println("Salary : " + salary);
    }

    @Override
    public void input (){
        super.input();
        Scanner s = new Scanner(System.in);
        System.out.print("Salary : ");
        salary = s.nextInt();
    }
}
