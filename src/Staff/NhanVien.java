package Staff;
import Interface.INhapXuat;

import java.util.Scanner;
class NhanVien implements INhapXuat {
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

    @Override
    public void Nhap() {
        System.out.print("Nhập mã nhân viên: ");
        MaNV=sc.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        ten=sc.nextLine();
        System.out.print("Nhập lương của nhân viên (Ngìn đồng): ");
        LuongCoBan=sc.nextInt();
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
