package buoi5.btvn.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Number of student : ");
        int n = s.nextInt();

        Student[] student = new Student[n];

        for (int i = 0; i < n; i++){
            student[i] = new Student();
            student[i].Input();
        }

        for (int i = 0; i < n; i++) {
            student[i].Output();
        }
    }
}
