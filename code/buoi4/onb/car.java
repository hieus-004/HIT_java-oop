package buoi4.onb;

public class car {
    //atribute : 
    private String name;
    private int manuIn;

    //method :
    void go (){
        System.out.println("goin");
    }

    void stop (){
        System.out.println("stopin");
    }

    void printoutin4(){
        System.out.println("Name: " + name);
        System.out.println("manu in: " + manuIn);
    }

    public String getname (){
        return name;
    }

    public void setname (String name2){
        name = name2 +" 2022";
    }

    public car(){

    }
    
    public car(String name2, int manuIn2){
        name = name2;
        manuIn = manuIn2;
    }
}
