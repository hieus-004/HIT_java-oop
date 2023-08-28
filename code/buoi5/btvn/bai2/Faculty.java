package buoi5.btvn.bai2;

import java.util.Scanner;

public class Faculty {
    private String Name;
    private String Date;
    private School x = new School();

    public Faculty (){

    }

    public Faculty (String Name, String Date, School x){
        this.Name = Name;
        this.Date = Date;
        this.x = x;
    }

    public void Input (){
        Scanner s = new Scanner (System.in);
        System.out.print("Name of faculty : ");
        Name = s.nextLine();
        System.out.print("Date of enrolment : ");
        Date = s.nextLine();
        System.out.print("Name of school : ");
        String SchoolName = s.nextLine();
        System.out.print("Date of enrolment : ");
        String SchoolDate = s.nextLine();
        x = new School(SchoolName, SchoolDate);

    }

    public void Output (){
        System.out.println("Name of faculty : " + Name);
        System.out.println("Date of enrolment : " + Date);
        System.out.println("Name of school : " + x.getName());
        System.out.println("Date of enrolment : " + x.getDate());
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public String getDate (){
        return Date;
    }

    public void setDate(String Date){
        this.Date = Date;
    }
}
