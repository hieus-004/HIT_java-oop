package buoi7.test.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Classroom classroom = new Classroom();

        classroom.input();
        classroom.output();

        System.out.print("Tim ai ? ");
        String x = s.nextLine();
        classroom.searchByName(x);
    }
}
