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
    public void setSoLuong(int sl){
        if(sl>=0) SoLuong=sl;
        else System.out.println("Số lượng không hợp lệ!");
    }

    public void setMaPX(String maPX) {
        if(maPX.contains("PX")) MaPX=maPX;
        else System.out.println("Mã phiếu xuất không hợp lệ!");
    }

    public void Nhap(){
        System.out.println("Mời bạn nhập mã phiếu xuất(PX001): ");
        setMaPX(sc.nextLine());
        System.out.println("Mời bạn nhập mã sản phẩm xuất ra : ");
        MaSP=sc.nextLine();
        System.out.println("Mời bạn nhập mã đại lý xuất: ");
        MaDL=sc.nextLine();
        System.out.println("Mời bạn nhập số lượng xuất: ");
        setSoLuong(sc.nextInt());
    }
    public void Xuat(){
        System.out.println("\nMã phiếu xuất: "+MaPX);
        System.out.println("Mã sản phẩm: "+MaSP);
        System.out.println("Mã đại lý: "+MaDL);
        System.out.println("Số lượng "+SoLuong);
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
