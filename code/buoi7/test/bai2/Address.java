package buoi7.test.bai2;

import java.util.Scanner;

public class Address {
    Scanner s = new Scanner(System.in);

    private String city;
    private String district;

    public Address(String city, String district) {
        this.city = city;
        this.district = district;
    }
    public Address(){

    }
    
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }

    public void input(){
        System.out.print("City : ");
        city = s.nextLine();
        System.out.print("District : ");
        district = s.nextLine();
    }

    public void output(){
        System.out.println("City : " + city);
        System.out.println("District : " + district);
    }
}
