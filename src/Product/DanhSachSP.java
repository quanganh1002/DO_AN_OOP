package Product;
import Interface.ITinhNang;

import java.io.*;

import java.util.ArrayList;
import java.util.Scanner;
public class DanhSachSP implements ITinhNang {
    private ArrayList<SanPham> DanhSachSP;
    public DanhSachSP(){
        DanhSachSP=new ArrayList<>();
    }
    public void Them() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nBạn muốn thêm loại sản phẩm nào:");
            System.out.println("1. Sản phẩm cao cấp");
            System.out.println("2. Sản phẩm phổ thông");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn chọn: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    SanPhamCaoCap sp1 = new SanPhamCaoCap();
                    sp1.Nhap();
                    SanPham s=found(sp1.getMaSP());
                    if(s!=null) System.out.println("Đã có mã sản phẩm này rồi!");
                    else {
                        DanhSachSP.add(sp1);
                        System.out.println("==> Đã thêm sản phẩm cao cấp!");
                    }
                    break;

                case 2:
                    SanPhamPhoThong sp2 = new SanPhamPhoThong();
                    sp2.Nhap();
                    SanPham s2=found(sp2.getMaSP());
                    if(s2!=null) System.out.println("Đã có mã sản phẩm này rồi!");
                    else{
                        DanhSachSP.add(sp2);
                        System.out.println("==> Đã thêm sản phẩm phổ thông!");
                    }

                    break;

                case 0:
                    System.out.println("Thoát chức năng thêm.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, mời nhập lại!");
            }

        } while (choice != 0);
    }

    @Override
    public void Sua() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm bạn muốn sửa: ");
        String Masp=sc.nextLine();
        boolean found=false;
        for (SanPham SP : DanhSachSP) {

            if (SP.getMaSP().equalsIgnoreCase(Masp)) {
                SP.Nhap();
                found = true;
                break;
            }

        }
        if(!found) System.out.println("Không có sản phẩm trong kho hàng!");
    }

    @Override
    public void Xoa() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm bạn muốn xóa: ");
        String Masp=sc.nextLine();
        boolean found=false;
        for (int i = 0; i < DanhSachSP.size(); i++) {
            SanPham SP = DanhSachSP.get(i);
            if (SP.getMaSP().equalsIgnoreCase(Masp)) {
                DanhSachSP.remove(i);
                found = true;
                break;
            }
        }

        if(!found) System.out.println("Không có sản phẩm trong kho hàng!");
    }

    @Override
    public void TimKiem() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm bạn muốn tìm: ");
        String Masp=sc.nextLine();
        boolean found=false;
        for (SanPham SP : DanhSachSP) {
            if (SP.MaSP.equalsIgnoreCase(Masp)) {
                SP.Xuat();
                found = true;
                break;
            }
        }
        if(!found) System.out.println("Không có sản phẩm trong kho hàng!");
    }

    @Override
    public void Xem() {
        System.out.println("\n======== Danh sách sản phẩm phổ thông ========");
        for(SanPham sp:DanhSachSP){
            if(sp instanceof SanPhamPhoThong) sp.Xuat();
        }
        System.out.println("\n======== Danh sách sản phẩm cao cấp ========");
        for(SanPham sp:DanhSachSP){
            if (sp instanceof SanPhamCaoCap) sp.Xuat();
        }
    }

    public void XuatTonKho(){
        System.out.println("Danh sách sản phẩm hết hàng: ");
        for (SanPham SP : DanhSachSP) {
            if (SP.getSoLuong() <= 20 && SP.getSoLuong() >= 0) {
                System.out.print(SP.getTen() + " : " + SP.getSoLuong());
                System.out.println();
            }
        }
        System.out.println("\nDanh sách sản phẩm còn tồn kho: ");
        for (SanPham SP : DanhSachSP) {
            if (SP.getSoLuong() >= 100) {
                System.out.print(SP.getTen() + " : " + SP.getSoLuong());
                System.out.println();
            }
        }
    }
    public SanPham found(String ma){
        for(SanPham sp:DanhSachSP){
            if(sp.getMaSP().equalsIgnoreCase(ma)){
                return sp;
            }
        }
        return null;
    }
    public void ghiFile() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("SanPham.txt"));
            for (SanPham sp : DanhSachSP) {
                if(sp.getMaSP().isEmpty())continue;
                if (sp instanceof SanPhamCaoCap) {
                    pw.println("CAOCAP");
                    pw.println(sp.getTen());
                    pw.println(sp.getMaSP());
                    pw.println(sp.getGia());
                    pw.println(sp.getNgaySX());
                    pw.println(sp.getSoLuong());
                    pw.println(((SanPhamCaoCap) sp).getThoiGianBH());
                } else {
                    pw.println("PHOTHONG");
                    pw.println(sp.getTen());
                    pw.println(sp.getMaSP());
                    pw.println(sp.getGia());
                    pw.println(sp.getNgaySX());
                    pw.println(sp.getSoLuong());
                }
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }
    public void docFile() {
        DanhSachSP.clear();
        try {
            Scanner sc = new Scanner(new File("SanPham.txt"));

            while (sc.hasNextLine()) {
                String loai = sc.nextLine();
                String ten = sc.nextLine();
                String ma = sc.nextLine();
                double gia = Double.parseDouble(sc.nextLine());
                String ngay = sc.nextLine();
                int sl = Integer.parseInt(sc.nextLine());

                if (loai.equals("CAOCAP")) {
                    int bh=Integer.parseInt(sc.nextLine());
                    DanhSachSP.add(new SanPhamCaoCap(ten, ma, gia, ngay, sl, bh));
                } else {
                    DanhSachSP.add(new SanPhamPhoThong(ten, ma, gia, ngay, sl));
                }
            }

            sc.close();

        } catch (Exception e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }

}
