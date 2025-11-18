import Agency.DanhSachDL;
import PhieuNhapXuat.DanhSachPhieu;
import Product.*;
import Staff.DanhSachNV;
import java.util.Scanner;

public class Main {
    DanhSachSP QLSanPham = new DanhSachSP();
    DanhSachPhieu QLPhieu=new DanhSachPhieu();
    DanhSachNV QLNhanVien = new DanhSachNV();
    DanhSachDL QLDaiLy=new DanhSachDL();
    Scanner sc = new Scanner(System.in);
    void MenuNV(){
        int choice;
        do{
            System.out.println("\n========== Các tính năng quản lý nhân viên==========");
            System.out.println("1. Thêm nhân viên");
            System.out.println("2. Xóa nhân viên");
            System.out.println("3. Tìm kiếm nhân viên");
            System.out.println("4. Sửa thông tin nhân viên");
            System.out.println("5. Xem danh sách nhân viên ");
            System.out.println("0. Thoát");
            System.out.println("========================================");
            System.out.print("Mời bạn lựa chọn: ");
            choice= sc.nextInt();
            switch (choice){
                case 1:
                    QLNhanVien.Them();
                    break;
                case 2:
                    QLNhanVien.Xoa();
                    break;
                case 3:
                    QLNhanVien.TimKiem();
                    break;
                case 4:
                    QLNhanVien.Sua();
                    break;
                case 5:
                    QLNhanVien.Xem();
                    break;
                case 0:
                    System.out.println("Thoát chức năng quản lý nhân viên");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lý, mời bạn nhập lại!");
                    break;
            }
        } while (choice != 0);
    }

    void MenuSP(){
        int choice;
        do{
            System.out.println("\n========== Các tính năng quản lý sản phẩm ==========");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xóa sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4. Sửa sản phẩm");
            System.out.println("5. Xem các sản phẩm còn tồn kho và sản phẩm hết hàng");
            System.out.println("6. Xem toàn bộ sản phẩm hiện có");
            System.out.println("0. Thoát");
            System.out.println("========================================\n");
            System.out.print("Mời bạn lựa chọn: ");
            choice= sc.nextInt();
            switch (choice){
                case 1:
                    QLSanPham.Them();
                    break;
                case 2:
                    QLSanPham.Xoa();
                    break;
                case 3:
                    QLSanPham.TimKiem();
                    break;
                case 4:
                    QLSanPham.Sua();
                    break;
                case 5:
                    QLSanPham.XuatTonKho();
                    break;
                case 6:
                    QLSanPham.Xem();
                    break;
                case 0:
                    System.out.println("Thoát chức năng quản lý sản phẩm");
                    QLSanPham.ghiFile();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lý mời bạn nhập lại");
                    break;
            }
        }while(choice!=0);
    }

    void MenuHoaDon(){
        int choice;
        do{
            System.out.println("\n========== Các tính năng quản lý hóa đơn nhập xuất ==========");
            System.out.println("1. Thêm hóa đơn");
            System.out.println("2. Xóa hóa đơn");
            System.out.println("3. Tìm kiếm hóa đơn");
            System.out.println("4. Sửa sản hóa đơn");
            System.out.println("5. Xem các hóa đơn chưa được cập nhập");
            System.out.println("6. Xem toàn bộ hóa đơn đã được cập nhập");
            System.out.println("7. Cập nhập toàn bộ sản phẩm trong hóa đơn (Các hóa đơn sẽ bị xóa sau khi cập nhập)");
            System.out.println("0. Thoát");
            System.out.println("========================================\n");
            System.out.print("Mời bạn lựa chọn: ");
            choice= sc.nextInt();
            switch (choice){
                case 1:
                    QLPhieu.Them();
                    break;
                case 2:
                    QLPhieu.Xoa();
                    break;
                case 3:
                    QLPhieu.TimKiem();
                    break;
                case 4:
                    QLPhieu.Sua();
                    break;
                case 5:
                    QLPhieu.Xem();
                    break;
                case 6:
                    QLPhieu.Xuatold();
                    break;
                case 7:
                    QLPhieu.CapNhapSL(QLSanPham,QLDaiLy);
                    break;
                case 0:
                    System.out.println("Thoát chức năng quản lý hóa đơn xuất nhập");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lý mời bạn nhập lại");
                    break;
            }
        }while(choice!=0);
    }
    void MenuDaiLy() {

        int choice;
        do {
            System.out.println("\n========-Tính năng của quản lý đại lý-========");
            System.out.println("1.Thêm đại lý");
            System.out.println("2.Xóa đại lý");
            System.out.println("3.Tìm đại lý");
            System.out.println("4.Sửa thông tin đại lý");
            System.out.println("5.Xem danh sách đại lý");
            System.out.println("0.Thoát");
            System.out.println("==================");
            System.out.print("Lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    QLDaiLy.Them();
                    break;
                case 2:
                    QLDaiLy.Xoa();
                    break;
                case 3:
                    QLDaiLy.TimKiem();
                    break;
                case 4:
                    QLDaiLy.Sua();
                    break;
                case 5:
                    QLDaiLy.Xem();
                    break;
                case 0:
                    System.out.println("Thoát chức năng quản lý đại lý");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lý, mời bạn nhập lại!");
                    break;
            }
        } while (choice != 0);

    }
    void MenuChinh(){
        int choice;
        do{
            System.out.println("\n======-Các tính năng quản lý kho-=====");
            System.out.println("1.Quản lý đại lý");
            System.out.println("2.Quản lý nhân viên");
            System.out.println("3.Quản lý sản phẩm");
            System.out.println("4.Quản lý hóa đơn nhập xuất");
            System.out.println("0.Thoát");
            System.out.println("=========================");
            System.out.print("Lựa chọn của bạn: ");
            choice =sc.nextInt();
            switch (choice){
                case 1:
                    MenuDaiLy();
                    break;
                case 2:
                    MenuNV();
                    break;
                case 3:
                    MenuSP();
                    break;
                case 4:
                    MenuHoaDon();
                    break;
                case 0:
                    System.out.println("Thoát chức năng quản lý");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lý mời bạn nhập lại");
                    break;
            }
        }while(choice!=0);
    }

    public static void main(String[] args){
        Main m=new Main();
        m.MenuChinh();
    }
}