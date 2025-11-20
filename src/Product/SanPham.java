package Product;
import Interface.INhapXuat;

import java.util.Scanner;
public class SanPham implements INhapXuat {
    protected String ten;
    protected String MaSP;
    protected double Gia;
    protected String NgaySX;
    protected int SoLuong;
    protected Scanner sc=new Scanner(System.in);

    public SanPham(String ten,String MaSP,double Gia,String NgaySX,int SoLuong){
        this.ten=ten;
        this.MaSP=MaSP;
        this.Gia=Gia;
        this.NgaySX=NgaySX;
        this.SoLuong=SoLuong;
    }

    public SanPham(){
        ten="";
        MaSP="";
        Gia=0;
        NgaySX="";
        SoLuong=0;
    }

    @Override
    public void Nhap() {
        System.out.print("Nhập tên sản phẩm: ");
        ten=sc.nextLine();
        System.out.print("Nhập mã sản phẩm (Ví dụ: SP001): ");
        setMaSP(sc.nextLine());
        System.out.print("Nhập Giá sản phẩm (Ngìn đồng): ");
        setGia(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhập ngày sản xuất của sản phẩm: ");
        NgaySX=sc.nextLine();
        System.out.print("Nhập Số lượng sản phẩm: ");
        setSoLuong(sc.nextInt());
    }

    @Override
    public void Xuat() {
        System.out.println("\n==Thông tin sản phẩm==");
        System.out.println(("Tên: "+ten));
        System.out.println("Mã sản phẩm: "+MaSP);
        System.out.println("Giá (Ngìn đồng): "+Gia);
        System.out.println("Ngày sản xuất: "+NgaySX);
        System.out.println("Số lương: "+SoLuong);
    }

    public String getTen() {
        return ten;
    }

    public double getGia() {
        return Gia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public String getMaSP() {
        return MaSP;
    }

    public String getNgaySX() {
        return NgaySX;
    }

    public void setSoLuong(int soLuong) {
        if(soLuong>=0) SoLuong=soLuong;
        else System.out.println("Số lượng sản phẩm không hợp lệ!");
    }
    public void setGia(int gia){
        if(gia>=0) Gia=gia;
        else System.out.println("Giá sản phẩm không hợp lệ!");
    }
    public void setMaSP(String ma){
        if(ma.contains("SP")) MaSP=ma;
        else System.out.println("Mã sản phẩm không hợp lệ!");
    }
}
