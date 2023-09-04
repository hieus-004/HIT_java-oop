package buoi6.btvn.bai2;

import java.util.Scanner;

public class Student extends Person {
    Scanner s = new Scanner(System.in);

    private String id;
    private String Class;
    private String school;
    
    public Student(String name, Byte age, String address, Date birthday, String id, String class1, String school) {
        super(name, age, address, birthday);
        this.id = id;
        Class = class1;
        this.school = school;
    }
    
    public Student() {
        
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    // loi~ khong the return 
    // public String getClass() {
    //     return Class;
    // }

    public void setClass(String class1) {
        Class = class1;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public void input(){
        super.input();
        System.out.print("ID ? ");
        id = s.nextLine();
        System.out.print("Class ? ");
        Class = s.nextLine();
        System.out.print("School ? ");
        school = s.nextLine();
    }

    @Override
    public void output(){
        super.output();
        System.out.println("Id : " + id);
        System.out.println("Class : " + Class);
        System.out.println("School : " + school);
    }
}
