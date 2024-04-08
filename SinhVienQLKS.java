/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xuongoop1;

/**
 *
 * @author ADMIN
 */
public class SinhVienQLKS extends SinhVien{
    private double diemQuanLy;
    private double diemNenTang;

    public double getDiemQuanLy() {
        return diemQuanLy;
    }

    public void setDiemQuanLy(double diemQuanLy) {
        this.diemQuanLy = diemQuanLy;
    }

    public double getDiemNenTang() {
        return diemNenTang;
    }

    public void setDiemNenTang(double diemNenTang) {
        this.diemNenTang = diemNenTang;
    }

    public SinhVienQLKS() {
    }

    public SinhVienQLKS(int maNganh, String maSinhVien, String tenSinhVien,double diemQuanLy, double diemNenTang) {
        super(maNganh,maSinhVien,tenSinhVien);
        this.diemQuanLy = diemQuanLy;
        this.diemNenTang = diemNenTang;
    }
    @Override
    public double setDiemTrungBinh(){
        return (this.getDiemNenTang() + this.getDiemQuanLy()) / 2;
    }
    @Override
    public String setHocLuc(){
        return super.setHocLuc();
    }
    @Override
    public void xuatThongTin(){
        super.xuatThongTin();
    }
}
