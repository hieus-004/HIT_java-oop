package buoi6.btvn.bai2;

import java.util.Scanner;

public class Person {
    Scanner s = new Scanner(System.in);

    private String name;
    private Byte age;
    private String address;
    private Date birthday = new Date();
    
    public Person(String name, Byte age, String address, Date birthday) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.birthday = birthday;
    }

    public Person (){

    }
    
    public Date getBirthday() {
        return birthday;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Byte getAge() {
        return age;
    }
    
    public void setAge(Byte age) {
        this.age = age;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public void input(){
        System.out.print("Name ? ");
        name = s.nextLine();
        System.out.print("Age ? ");
        age = s.nextByte();
        s.nextLine();
        System.out.print("Address ? ");
        address = s.nextLine();
        birthday.input();
    }

    public void output(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Address : " + address);
        birthday.output();
    }
}
