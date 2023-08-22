package buoi4;

public class on {
    
    public static void main(String[] args) {
        car car1 = new car("obobob", 2000);
        car car2 = new car();
        
        car1.printoutin4();
        car1.setname(car1.getname());
        System.out.println(car1.getname());
        
        car2.setname(car2.getname());
        System.out.println(car2.getname());
    }
}