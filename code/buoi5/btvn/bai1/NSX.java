package buoi5.btvn.bai1;

import java.util.Scanner;

public class NSX {
    private String MaNSX;
    private String TenNSX;
    private String DcNSX;

    public NSX (){

    }

    public NSX (String MaNSX, String TenNSX, String DcNSX){
        this.MaNSX = MaNSX;
        this.TenNSX = TenNSX;
        this.DcNSX = DcNSX;
    }

    public void Nhap (){
        Scanner s = new Scanner(System.in);
        System.out.print("Ma NSX : ");
        MaNSX = s.nextLine();
        System.out.print("Ten NSX : ");
        TenNSX = s.nextLine();
        System.out.print("Dia chi NSX : ");
        DcNSX = s.nextLine();
    }

    public void Xuat (){
        System.out.println("Ma NSX : " + MaNSX);
        System.out.println("Ten NSX : " + TenNSX);
        System.out.println("Dia chi NSX : " + DcNSX);
    } 
}
