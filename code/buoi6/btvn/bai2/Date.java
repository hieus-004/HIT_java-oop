package buoi6.btvn.bai2;

import java.util.Scanner;

public class Date {
    Scanner s = new Scanner(System.in);

    private int year;
    private Byte month;
    private Byte day;

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public Byte getMonth() {
        return month;
    }
    public void setMonth(Byte month) {
        this.month = month;
    }
    
    public Byte getDay() {
        return day;
    }
    public void setDay(Byte day) {
        this.day = day;
    }

    public Date (){

    }
    
    public Date(int year, Byte month, Byte day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void input (){
        System.out.print("Year of birth ? ");
        year = s.nextInt();
        System.out.print("Month of birth ? ");
        month = s.nextByte();
        System.out.print("Day of birth ? ");
        day = s.nextByte();
    }

    public void output (){
        System.out.println("Birthday : " + day + "/" + month + "/" + year);
    }
}
