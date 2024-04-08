/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xuongoop1;

/**
 *
 * @author ADMIN
 */
public class SinhVienMar extends SinhVien{
    private double diemSale;
    private double diemDoiDap;

    public double getDiemSale() {
        return diemSale;
    }

    public void setDiemSale(double diemSale) {
        this.diemSale = diemSale;
    }

    public double getDiemDoiDap() {
        return diemDoiDap;
    }

    public void setDiemDoiDap(double diemDoiDap) {
        this.diemDoiDap = diemDoiDap;
    }

    public SinhVienMar(int maNganh, String maSinhVien, String tenSinhVien,double diemSale, double diemDoiDap) {
        super(maNganh,maSinhVien,tenSinhVien);
        this.diemSale = diemSale;
        this.diemDoiDap = diemDoiDap;
    }

    public SinhVienMar() {
    }
    @Override
    public double setDiemTrungBinh(){
        return (this.getDiemDoiDap() + this.getDiemSale()) / 2;
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
