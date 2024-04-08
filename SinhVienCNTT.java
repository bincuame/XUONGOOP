/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xuongoop1;

/**
 *
 * @author ADMIN
 */
public class SinhVienCNTT extends SinhVien{
    private double diemJava;
    private double diemHTML;
    private double diemCSS;

    public SinhVienCNTT(int maNganh, String maSinhVien, String tenSinhVien,double diemJava, double diemHTML, double diemCSS) {
        super(maNganh,maSinhVien,tenSinhVien);
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemCSS = diemCSS;
    }

    public SinhVienCNTT() {
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemHTML() {
        return diemHTML;
    }

    public void setDiemHTML(double diemHTML) {
        this.diemHTML = diemHTML;
    }

    public double getDiemCSS() {
        return diemCSS;
    }

    public void setDiemCSS(double diemCSS) {
        this.diemCSS = diemCSS;
    }
    @Override 
    public double setDiemTrungBinh(){
        return (this.getDiemCSS() + this.getDiemHTML() + this.getDiemJava()) / 3;
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
