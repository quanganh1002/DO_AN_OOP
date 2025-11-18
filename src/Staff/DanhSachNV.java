package Staff;
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
                    DanhSachNV.add(nv1);
                    System.out.println("==> Đã thêm quản lý!");
                    break;

                case 2:
                    CongNhan nv2=new CongNhan();
                    nv2.Nhap();
                    DanhSachNV.add(nv2);
                    System.out.println("==> Đã thêm nhân viên!");
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
}
