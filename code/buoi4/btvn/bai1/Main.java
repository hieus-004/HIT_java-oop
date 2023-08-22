package buoi4.btvn.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Books[] Book = new Books[5];

        for (int i = 0; i < 5; i++){
            Scanner s = new Scanner(System.in);
            System.out.print("Nhap ma sach: ");
            String maSach = s.nextLine();
            System.out.print("Nhap ten sach: ");
            String tenSach = s.nextLine();
            System.out.print("Nhap tac gia: ");
            String tacGia = s.nextLine();
            System.out.print("Nhap nxb: ");
            String nxb = s.nextLine();
            System.out.print("Nhap nam xb: ");
            int namXB = s.nextInt();
            s.nextLine(); 

            Book[i] = new Books(maSach, tenSach, tacGia, nxb, namXB);
        }

        System.out.printf("%-10s%-30s%-20s%-20s%-5s\n", "Ma sach", "Ten sach", "Tac gia", "Nha xuat ban", "Nam xuat ban");
        for (int i = 0; i < 5; i++){
            Book[i].display(); 
        }
    }
}
