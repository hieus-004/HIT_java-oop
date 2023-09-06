package buoi7.test.bai2;

import java.util.Scanner;

public class Person {
    
    private String name;
    private int age;
    private String gender;
    
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public Person(){

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void input(){
        Scanner s = new Scanner(System.in);

        System.out.print("Name : ");
        name = s.nextLine();
        System.out.print("Age : ");
        age = s.nextInt();
        s.nextLine();
        System.out.print("Gender : ");
        gender = s.nextLine();

    }

    public void output(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
    }
}
