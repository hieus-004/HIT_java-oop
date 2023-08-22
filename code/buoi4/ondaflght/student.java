package buoi4.ondaflght;

public class student {
    private int id;
    private String name;
    private int age;
    private String address;
    private int score;

    public student(){

    }

    public student(int id2, String name2, int age2,
     String address2, int score2){
        id = id2;
        age = age2;
        address = address2;
        score = score2;
     }

     public void setId(int id2){
        id = id2;
     }

     public int getId(){
        return id;
     }

     public void setname(String name2){
        name = name2;
     }

     public String getname(){
        return name;
     }

     public void setage(int age2){
        age = age2;
     }

     public int getage(){
        return age;
     }

     public void setaddress(String address2){
        address = address2;
     }

     public String getaddress(){
        return address;
     }

     public void setscore(int score2){
        score = score2;
     }

     public int getscore(){
        return score;
     }


}
