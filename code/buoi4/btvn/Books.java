package buoi4.btvn;

import java.util.Scanner;

public class Books {
    Scanner s = new Scanner(System.in);
    
    private int code;
    private String name;
    private String author;
    private String publisher;
    private int year;

    public Books(){
        
    }

    public Books(int code2, String name2, String author2,
                String publisher2, int year2){
        code = code2;
        name = name2;
        author = author2;
        publisher = publisher2;
        year = year2;
    }

    public void display(){
        System.out.printf("%d", code);
        System.out.printf("%-10s", name);
        System.out.printf("%-10s", author);
        System.out.printf("%-10s", publisher);
        System.out.printf("%-10d", year);
    }

}
