package PhieuNhapXuat;

import java.util.Scanner;

public class PhieuXuat extends Phieu {
    protected String MaPX;
    protected String MaSP;
    protected String MaDL;
    protected int SoLuong;
    protected Scanner sc=new Scanner(System.in);
    PhieuXuat(){
        MaDL="";
        MaSP="";
        MaPX="";
        SoLuong=0;
    }
    PhieuXuat(String MaPX,String MaSP,String MaDL,int SoLuong){
        this.MaPX=MaPX;
        this.SoLuong=SoLuong;
        this.MaDL=MaDL;
        this.MaSP=MaSP;
    }
    public void Nhap(){
        System.out.println("Mời bạn nhập mã phiếu xuất: ");
        MaPX= sc.nextLine();
        System.out.println("Mời bạn nhập mã sản phẩm xuất ra : ");
        MaSP=sc.nextLine();
        System.out.println("Mời bạn nhập mã đại lý xuất: ");
        MaDL=sc.nextLine();
        System.out.println("Mời bạn nhập số lượng xuất: ");
        SoLuong=sc.nextInt();
    }
    public void Xuat(){
        System.out.print("Mã phiếu xuất: "+MaPX);
        System.out.print("Mã sản phẩm: "+MaSP);
        System.out.print("Mã đại lý: "+MaDL);
        System.out.print("Số lượng "+SoLuong);
    }

    public String getMaSP() {
        return MaSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public String getMaDL() {
        return MaDL;
    }

    public String getMaPX() {
        return MaPX;
    }
}
