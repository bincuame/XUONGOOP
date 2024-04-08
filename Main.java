/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xuongoop1;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySinhVien ql = new QuanLySinhVien();
        int chon;
        do {            
            System.out.println("=====================MENU=====================");
            System.out.println("1.Nhap danh sach.");
            System.out.println("2.Xuat danh sach.");
            System.out.println("3.Xoa sinh vien.");
            System.out.println("4.Tim kiem sinh vien theo ma.");
            System.out.println("5.Tim kiem trong khoang diem.");
            System.out.println("6.Sap xep theo diem trung binh(Max-->Min).");
            System.out.println("7.Sap xep theo ten sinh vien.");
            System.out.println("8.Xuat 3 sinh vien diem cao nhat.");
            System.out.println("9.Xuat 3 sinh vien diem thap nhat.");
            System.out.println("10.Cap nhat sinh vien theo ma.");
            System.out.println("11.Xoa toan bo du lieu.");
            System.out.println("12.Thoat chuong trinh.");
            System.out.println("==============================================");
            System.out.println("Moi ban chon chuc nang");
            chon = sc.nextInt();
            switch(chon){
                case 1:
                    ql.nhapDs();
                    break;
                case 2:
                    ql.xuatDs();
                    break;
                case 3:
                    ql.xoaSV();
                    break;
                case 4:
                    ql.timTheoMa();
                    break;
                case 5:
                    ql.timTheoKhoangDiem();
                    break;
                case 6:
                    ql.sapXepTheoDiem();
                    break;
                case 7:
                    ql.sapXepTheoTen();
                    break;
                case 8:
                    ql.xuat3SvDiemCaoNhat();
                    break;
                case 9:
                    ql.xuat3SvDiemThapNhat();
                    break;
                case 10:
                    ql.capNhat();
                    break;
                case 11:
                    ql.xoaAll();
                    break;
                case 12:
                    System.out.println("Chuong trinh da ngung........");
                    System.exit(0);
                default:
                    System.out.println("Moi ban chon lai chuc nang....");
                    break;
            }
        } while (true);
    }
    
}
