package Staff;
import Interface.INhapXuat;

import java.util.Scanner;
public class NhanVien implements INhapXuat {
    protected String ten;
    protected String MaNV;
    protected double LuongCoBan;
    protected String NgaySinh;
    protected Scanner sc=new Scanner(System.in);

    public NhanVien(String ten, String MaNV, double LuongCoBan, String NgaySinh) {
        this.ten = ten;
        this.MaNV = MaNV;
        this.LuongCoBan = LuongCoBan;
        this.NgaySinh = NgaySinh;
    }

    public NhanVien() {
        ten = "";
        MaNV = "";
        LuongCoBan = 0;
        NgaySinh = "";
    }
    public void setMaNV(String manv){
        if(manv.contains("NV")) MaNV=manv;
        else System.out.println("mã nhân viên không hợp lệ");
    }

    public void setLuongCoBan(double luongCoBan) {
        if(luongCoBan>=0) luongCoBan=LuongCoBan;
        else System.out.println("Lương cơ bản của nhân viên không hợp lý!");
    }

    @Override
    public void Nhap() {
        System.out.print("Nhập mã nhân viên (Ví dụ NV001): ");
        setMaNV(sc.nextLine());
        System.out.print("Nhập tên nhân viên: ");
        ten=sc.nextLine();
        System.out.print("Nhập lương của nhân viên (Ngìn đồng): ");
        setLuongCoBan(sc.nextDouble());
        sc.nextLine();
        System.out.print("Nhập ngày sinh của nhân viên: ");
        NgaySinh=sc.nextLine();
    }

    @Override
    public void Xuat() {
        System.out.println("\n==Thông tin Nhân Viên==");
        System.out.println(("Tên Nhân Viên: "+ten));
        System.out.println("Mã Nhân Viên: "+MaNV);
        System.out.println("Lương (Ngìn đồng): "+LuongCoBan);
        System.out.println("Ngày Sinh: "+NgaySinh);
    }

    public String getTen() {
        return ten;
    }

    public String getMaNV() {
        return MaNV;
    }

    public double getLuongCoBan() {
        return LuongCoBan;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

}
