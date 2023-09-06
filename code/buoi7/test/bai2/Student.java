package buoi7.test.bai2;

import java.util.Scanner;

public class Student extends Person {
    Scanner s = new Scanner (System.in);

    private int id;
    private Address address = new Address();
    private double gpa;

    

    public Student(String name, int age, String gender, int id, Address address, double gpa) {
        super(name, age, gender);
        this.id = id;
        this.address = address;
        this.gpa = gpa;
    }
    public Student() {
        
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override 
    public void input(){
        super.input();
        System.out.print("ID : ");
        id = s.nextInt();
        System.out.print("GPA : ");
        gpa = s.nextDouble();

        s.nextLine();
        address.input();
    }

    @Override
    public void output(){
        super.output();
        System.out.println("ID : " + id);
        System.out.println("GPA : " + gpa);
        address.output();
    }

}
