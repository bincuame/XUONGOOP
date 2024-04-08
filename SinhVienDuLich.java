/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xuongoop1;

/**
 *
 * @author ADMIN
 */
public class SinhVienDuLich extends SinhVien{
    private double diemCham;
    private double diemGiaoTiep;

    public double getDiemCham() {
        return diemCham;
    }

    public void setDiemCham(double diemCham) {
        this.diemCham = diemCham;
    }

    public double getDiemGiaoTiep() {
        return diemGiaoTiep;
    }

    public void setDiemGiaoTiep(double diemGiaoTiep) {
        this.diemGiaoTiep = diemGiaoTiep;
    }

    public SinhVienDuLich(int maNganh, String maSinhVien, String tenSinhVien,double diemCham, double diemGiaoTiep) {
        super(maNganh,maSinhVien,tenSinhVien);
        this.diemCham = diemCham;
        this.diemGiaoTiep = diemGiaoTiep;
    }

    public SinhVienDuLich() {
    }
    @Override
    public double setDiemTrungBinh(){
        return (this.getDiemCham() + this.getDiemGiaoTiep()) / 2;
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
