/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xuongoop1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QuanLySinhVien {
    ArrayList<SinhVien> ds = new ArrayList<SinhVien>();
    public void nhapDs(){
        Scanner sc = new Scanner(System.in);
        int maNgannh;
        String maSinhVien;
        String tenSinhVien;
        do {            
            System.out.println("===>Nhap vao danh sach sinh vien<===");
            do {                
                System.out.println("Nhap ma sinh vien:");
                maSinhVien = sc.nextLine();
                String maMau = "ph[0-9]{3,3}";
                if(maSinhVien.matches(maMau)){
                    break;
                }else System.out.println("Yeu cau nhap lai cho dung form ma");
            } while (true);
            System.out.println("Nhap ten sinh vien:");
            tenSinhVien = sc.nextLine();
            System.out.println("Nhap vao nghanh cua sinh vien do: "); 
            do {  
                System.out.println("Moi ban chon|1.CNTT|2.Marketing|3.DuLich|4.QLKS");
                maNgannh = sc.nextInt();
            } while (maNgannh < 1 || maNgannh > 4);
            switch(maNgannh){
                case 1:
                    System.out.println("Sinh vien CNTT");
                    System.out.println("Moi ban nhap diem java");
                    double diemJava = sc.nextDouble();
                    System.out.println("Nhap diem html");
                    double diemHTML = sc.nextDouble();
                    System.out.println("Nhap diem css");
                    double diemCSS = sc.nextDouble();
                    SinhVien sv1 = new SinhVienCNTT(maNgannh,maSinhVien,tenSinhVien,diemJava,diemHTML,diemCSS);
                    ds.add(sv1);
                    break;
                case 2:
                    System.out.println("Sinh vien Marketing");
                    System.out.println("Nhap diem sale");
                    double diemSale = sc.nextDouble();
                    System.out.println("Nhap diem doi dap");
                    double diemDoiDap = sc.nextDouble();
                    SinhVien sv2 = new SinhVienMar(maNgannh,maSinhVien,tenSinhVien,diemSale,diemDoiDap);
                    ds.add(sv2);
                    break;
                case 3:
                    System.out.println("Sinh vien Du Lich");
                    System.out.println("Nhap diem cham");
                    double diemCham = sc.nextDouble();
                    System.out.println("Nhap diem giao tiep");
                    double diemGiaoTiep = sc.nextDouble();
                    SinhVien sv3 = new SinhVienDuLich(maNgannh,maSinhVien,tenSinhVien,diemCham,diemGiaoTiep);
                    ds.add(sv3);
                    break;
                case 4:
                    System.out.println("Sinh vien quan ly khach san");
                    System.out.println("Nhap diem quan ly");
                    double diemQuanLy = sc.nextDouble();
                    System.out.println("Nhap diem nen tang");
                    double diemNenTang = sc.nextDouble();
                    SinhVien sv4 = new SinhVienQLKS(maNgannh,maSinhVien,tenSinhVien,diemQuanLy,diemNenTang);
                    ds.add(sv4);
                    break;
                default:
                    System.out.println(".......");
                    break;
            }
            System.out.println("Ban co muon nhap tiep khong|1.Co|2.Khong");
            sc.nextLine();
            if(sc.nextLine().equals("2")){
                System.out.println("Da nhap xong!!!!");
                break;
            }else{
                System.out.println("Moi ban nhap tiep.......");
            }
        } while (true);
    }
    public void xuatDs(){
        System.out.println("<---------Danh sach Sinh Vien--------->");
        System.out.println("Ma Nghanh\t\t\tMa Sinh Vien\t\t\tTen Sinh Vien\t\t\tDiem Trung Binh\t\t\tHoc Luc");
        if(ds.isEmpty()){
            System.out.println("¯\\_(ツ)_/¯");
            System.out.println("Danh sach sinh vien trong......");
        }else
        for(SinhVien list : ds){
            list.xuatThongTin();
        }
    }
    public void xoaSV(){
        Scanner sc  = new  Scanner(System.in);
        System.out.println("Moi ban nhap ma sinh vien muon loai bo: ");
        String ma = sc.nextLine();
        boolean sv  = false;
        for(SinhVien list : ds){
            if(list.getMaSinhVien().equals(ma)){
                ds.remove(list);
                sv = true;
                System.out.println("Da loai bor sinh vien nay");
                break;
            }
        }
        if(sv == false){
            System.out.println("Ko co sv nay....");
        }
    }
    public void timTheoMa(){
        Scanner sc = new Scanner(System.in);
        System.out.println("MOi ban nhap ma sinh vien muon tim kiem:");
        String ma = sc.nextLine();
        boolean sv = false;
        for(SinhVien list : ds){
            if(list.getMaSinhVien().equals(ma)){
                list.xuatThongTin();
                sv = true;
                break;
            }
        }
        if(sv == false){
            System.out.println("¯\\_(ツ)_/¯");
            System.out.println("Ko tim thay sinh vien co ma so nay.....");
        }        
    }
    public void timTheoKhoangDiem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap min");
        Integer min = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap max");
        Integer max = Integer.parseInt(sc.nextLine());
        boolean sv = false;
        for(SinhVien list : ds){
            if(list.setDiemTrungBinh() >= min && list.setDiemTrungBinh() <= max){
                list.xuatThongTin();
                sv = true;
                break;
            }
        }
        if(sv == false){
            System.out.println("¯\\_(ツ)_/¯");
            System.out.println("Ko tim thay sinh vien nao nam trong khoan diem nay....");
        }
    }
    public void sapXepTheoDiem(){
        Collections.sort(ds, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.setDiemTrungBinh() > o2.setDiemTrungBinh() ? -1 : 1;
            }            
        });
        System.out.println("Da sap xep xong.......");
    }
    public void sapXepTheoTen(){
        Collections.sort(ds, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getTenSinhVien().compareTo(o2.getTenSinhVien());
            }
        });
        System.out.println("Da sap xep xong.....");
    }
    public void xuat3SvDiemCaoNhat(){
        Collections.sort(ds, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o1.setDiemTrungBinh(), o2.setDiemTrungBinh());
            }
        });
        Collections.reverse(ds);
        int i = 0;
        for(SinhVien list : ds){
            System.out.println("Ma sinh vien:" + list.getMaSinhVien()+"|\t\t|Ten sinh vien:" +list.getTenSinhVien()+"|\t\t|Diem trung binh:"+list.setDiemTrungBinh()+"|\t\t|Hoc Luc:" + list.setHocLuc());
            i++;
            if(i==3){
                break;
            }
        }
    }
    public void xuat3SvDiemThapNhat(){
        Collections.sort(ds, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return Double.compare(o1.setDiemTrungBinh(), o2.setDiemTrungBinh());
            }            
        });
        int i = 0;
        for(SinhVien list : ds){
            System.out.println("Ma sinh vien:" + list.getMaSinhVien()+"|\t\t|Ten sinh vien:" +list.getTenSinhVien()+"|\t\t|Diem trung binh:"+list.setDiemTrungBinh()+"|\t\t|Hoc Luc:" + list.setHocLuc());            
            i++;
            if(i==3){
                break;
            }
        }
    }
    public void capNhat(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sin vien ma ban muon cao nhat:");
        String maSv = sc.nextLine();
        int index = 0;
        SinhVien sv = null;
        for(SinhVien list : ds){
            if(list.getMaSinhVien().equalsIgnoreCase(maSv)){
                sv = list;
                index = ds.indexOf(sv);
                break;
            }
        }
        if(sv != null){
            System.out.println("Moi ban nhap ten: ");
            String ten = sc.nextLine();
            if(ten.isEmpty()){
                ten = sv.getTenSinhVien();
            }
            String ma;
            do {                
                System.out.println("Moi ban nhap ma:");
                ma = sc.nextLine();
                String mauMa = "ph[0-9]{3,3}";
                if(ma.matches(mauMa) || ma.isEmpty()){
                    break;
                }else System.out.println("Ban da nhap sai kieu cua ma sinh vien");
            } while (true);
            if(ma.isEmpty()){
                ma = sv.getMaSinhVien();
            }                
            
            if(sv instanceof SinhVienCNTT){
                System.out.println("Nhap diem java:");
                double java = sc.nextDouble();
                if(java == 0 ){
                    java = ((SinhVienCNTT) sv).getDiemJava();
                }
                System.out.println("Nhap diem html:");
                double html = sc.nextDouble();
                if(html == 0){
                    html = ((SinhVienCNTT) sv).getDiemHTML();
                }
                System.out.println("Nhap diem css:");
                double css = sc.nextDouble();
                if(css == 0){
                    css = ((SinhVienCNTT) sv).getDiemCSS();
                }
                SinhVien svcntt = new SinhVienCNTT(1,ma,ten,java,html,css);
                ds.set(index, svcntt);
            }
            if(sv instanceof SinhVienDuLich){
                System.out.println("Nhap diem cham:");
                double cham = sc.nextDouble();
                if(cham == 0){
                    cham = ((SinhVienDuLich) sv).getDiemCham();
                }
                System.out.println("Nhap diem giao tiep: ");
                double gt = sc.nextDouble();
                if(gt == 0){
                    gt = ((SinhVienDuLich) sv).getDiemGiaoTiep();
                }
                SinhVien svdl = new SinhVienDuLich(2,ma,ten,cham,gt);
                ds.set(index, svdl);
            }
            if(sv instanceof SinhVienMar){
                System.out.println("Nhap diem sale:");
                double sale = sc.nextDouble();
                if(sale == 0){
                    sale = ((SinhVienMar) sv).getDiemSale();
                }
                System.out.println("Nhap diem doi dap:");
                double doiDap = sc.nextDouble();
                if(doiDap == 0){
                    doiDap = ((SinhVienMar) sv).getDiemDoiDap();
                }
                SinhVien svm = new SinhVienMar(3,ma,ten,sale,doiDap);
                ds.set(index, svm);
            }
            if(sv instanceof SinhVienQLKS){
                System.out.println("Nhap diem quan ly:");
                double quanLy = sc.nextDouble();
                if(quanLy == 0){
                    quanLy = ((SinhVienQLKS) sv).getDiemQuanLy();
                }
                System.out.println("Nhap diem nen tang:");
                double nenTang = sc.nextDouble();
                if(nenTang == 0){
                    nenTang = ((SinhVienQLKS) sv).getDiemNenTang();
                }
                SinhVien svQlKS = new SinhVienQLKS(4,ma,ten,quanLy,nenTang);
                ds.set(index, svQlKS);
            }
            System.out.println("Cap nhat thanh cong!!!!");
            
            
        }else{
            System.out.println("Ko tim thay sinh vien can cap nhat......");
        }
    }
    public void xoaAll(){
        ds.removeAll(ds);
        System.out.println("Da xoa toan bo du lieu.....");
    }
}
