package buoi4.btvn.bai1;

import java.util.Scanner;

public class Books {
    Scanner s = new Scanner(System.in);
    
    private String code;
    private String name;
    private String author;
    private String publisher;
    private int year;

    public Books(){
        
    }

    public Books(String code2, String name2, String author2,
                String publisher2, int year2){
        code = code2;
        name = name2;
        author = author2;
        publisher = publisher2;
        year = year2;
    }

    public void display(){
        System.out.format("%-10s", code);
        System.out.format("%-30s", name);
        System.out.format("%-20s", author);
        System.out.format("%-20s", publisher);
        System.out.format("%-5d", year);
        System.out.println();
    }
    

}
