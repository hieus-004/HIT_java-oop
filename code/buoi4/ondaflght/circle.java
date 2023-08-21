package buoi4.ondaflght;

public class circle {
    private double radius;

    public circle(){

    }

    public circle(double radius2){
        radius = radius2;
    }

    public double getArea(){
        return radius * radius * 3.14;
    }

    public double getCircumference(){
        return 2 * radius * 3.14;
    }
}
