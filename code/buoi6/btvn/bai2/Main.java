package buoi6.btvn.bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        ArrayList<Student> students = new ArrayList<Student>();

        System.out.print("Number of student ? ");
        int n = s.nextInt();

        for(int i = 0; i < n; i++){
            Student student = new Student();
            student.input();
            students.add(student);
        }

        for (Student student : students){
            student.output();
        }

        s.close();
    }
}
