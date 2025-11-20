package Staff;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import Interface.ITinhNang;

public class DanhSachNV implements ITinhNang {
    private ArrayList<NhanVien> DanhSachNV;

    public DanhSachNV() {
        DanhSachNV = new ArrayList<>();
    }
    public void Them(){
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nBạn muốn nhân viên có chức vụ nào:");
            System.out.println("1. Quản lý");
            System.out.println("2. Công nhân");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn chọn: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    QuanLy nv1=new QuanLy();
                    nv1.Nhap();
                    NhanVien n=found(nv1.getMaNV());
                    if(n!=null)
                        System.out.println("Đã có mã nhân viên này rồi!");
                    else {
                        DanhSachNV.add(nv1);
                        System.out.println("==> Đã thêm quản lý!");
                    }
                    break;

                case 2:
                    CongNhan nv2=new CongNhan();
                    nv2.Nhap();
                    NhanVien n2=found(nv2.getMaNV());
                    if(n2!=null) System.out.println("Đã có mã nhân viên này rồi!");
                    else{
                        DanhSachNV.add(nv2);
                        System.out.println("==> Đã thêm nhân viên!");
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
    public void Sua(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên bạn muốn sửa: ");
        String ma = sc.nextLine();
        boolean found = false;

        for (NhanVien nv : DanhSachNV) {
            if (nv.getMaNV().equalsIgnoreCase(ma)) {
                System.out.println("Nhập thông tin mới cho nhân viên:");
                nv.Nhap(); // nhập lại toàn bộ thông tin
                System.out.println("Cập nhật thành công!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy nhân viên!");
        }
    }

    @Override
    public void Xoa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên cần xóa: ");
        String ma = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < DanhSachNV.size(); i++) {
            NhanVien nv = DanhSachNV.get(i);

            if (nv.getMaNV().equalsIgnoreCase(ma)) {

                // Xóa khỏi danh sách tổng
                DanhSachNV.remove(i);


                System.out.println("Đã xóa nhân viên thành công!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy nhân viên có mã này!");
        }
    }

    @Override
    public void TimKiem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên cần tìm: ");
        String ma = sc.nextLine();
        boolean found = false;

        for (NhanVien nv : DanhSachNV) {
            if (nv.getMaNV().equalsIgnoreCase(ma)) {
                System.out.println("==> Kết quả tìm kiếm:");
                nv.Xuat();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy nhân viên nào có mã này!");
        }
    }

    @Override
    public void Xem() {
        System.out.println("====== DANH SÁCH NHÂN VIÊN ======");
        for (NhanVien nv:DanhSachNV) nv.Xuat();
        System.out.println("==========================================");
    }
    public void ghiFile() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("NhanVien.txt"));
            for (NhanVien nv : DanhSachNV) {
                if(nv.getMaNV().isEmpty())continue;
                if (nv instanceof QuanLy) {
                    pw.println("QuanLy");
                    pw.println(nv.getMaNV());
                    pw.println(nv.getTen());
                    pw.println(nv.getLuongCoBan());
                    pw.println(nv.getNgaySinh());
                    pw.println(((QuanLy) nv).getHeSoChucVu());
                } else {
                    pw.println("CongNhan");
                    pw.println(nv.getMaNV());
                    pw.println(nv.getTen());
                    pw.println(nv.getLuongCoBan());
                    pw.println(nv.getNgaySinh());
                }
            }
            pw.close();
            System.out.println("Ghi file thành công!");
        } catch (Exception e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }
    public void docFile() {
        DanhSachNV.clear();
        try {
            Scanner sc = new Scanner(new File("NhanVien.txt"));

            while (sc.hasNextLine()) {
                String loai = sc.nextLine();
                String ma = sc.nextLine();
                String ten = sc.nextLine();
                double luong = Double.parseDouble(sc.nextLine());
                String ngaysinh = sc.nextLine();

                if (loai.equals("QuanLy")) {
                    double hscv = Double.parseDouble(sc.nextLine());
                    DanhSachNV.add(new QuanLy(ten, ma, luong, ngaysinh, hscv));
                } else {
                    DanhSachNV.add(new CongNhan(ten, ma, luong, ngaysinh));
                }
            }

            sc.close();
            System.out.print("Đã đọc file!");

        } catch (Exception e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }
    public NhanVien found(String ma){
        for(NhanVien nv:DanhSachNV){
            if( nv.getMaNV().equalsIgnoreCase(ma)) return  nv;
        }
        return  null;
    }
}
