package buoi7.test.bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {
    Scanner s = new Scanner(System.in);

    private int classId;
    private int numberOfStudent;
    private ArrayList<Student> listStudents = new ArrayList<Student>();
    
    public Classroom(int classId, int numberOfStudent, ArrayList<Student> listStudents) {
        this.classId = classId;
        this.numberOfStudent = numberOfStudent;
        this.listStudents = listStudents;
    }
    public Classroom(){

    }

    public int getClassId() {
        return classId;
    }
    public void setClassId(int classId) {
        this.classId = classId;
    }
    public int getNumberOfStudent() {
        return numberOfStudent;
    }
    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }
    public ArrayList<Student> getListStudents() {
        return listStudents;
    }
    public void setListStudents(ArrayList<Student> listStudents) {
        this.listStudents = listStudents;
    }

    public void input(){
        System.out.print("Class id : ");
        classId = s.nextInt();
        System.out.print("Number of student : ");
        numberOfStudent = s.nextInt();
        s.nextLine();

        for (int i = 0; i < numberOfStudent; i++){
            Student student = new Student();
            student.input();

            listStudents.add(student);
        }

    }

    public void output(){
        System.out.println("Class id : " + classId);
        System.out.println("Number of student : " + numberOfStudent);

        for (Student student : listStudents){
            student.output();
        }
    }

    public void searchByName (String name){
        for (Student student : listStudents){
            if (name == student.getName()){
                student.output();
            }
        }
    }
}
