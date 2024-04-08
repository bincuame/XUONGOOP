/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xuongoop1;

/**
 *
 * @author ADMIN
 */
abstract public class SinhVien {
    private int maNganh;
    private String maSinhVien;
    private String tenSinhVien;

    public int getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(int maNganh) {
        this.maNganh = maNganh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public SinhVien() {
    }

    public SinhVien(int maNganh, String maSinhVien, String tenSinhVien) {
        this.maNganh = maNganh;
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
    }
    abstract public double setDiemTrungBinh();
    public String setHocLuc(){
        if(this.setDiemTrungBinh() >= 9){
            return "Xuat Sac";
        }else if(this.setDiemTrungBinh() >= 8 ){
            return "Gioi";
        }else if(this.setDiemTrungBinh() >= 6 ){
            return "Kha";
        }else if(this.setDiemTrungBinh() >= 4 ){
            return "Trung Binh";
        }else{
            return "Yeu";
        }
    }
    public void xuatThongTin(){
        System.out.printf("|%d\t\t\t\t|%s\t\t\t\t|%s\t\t\t\t|%f\t\t\t%s|\n",this.getMaNganh(),this.getMaSinhVien(),
                this.getTenSinhVien(),this.setDiemTrungBinh(),this.setHocLuc());
    }
}
