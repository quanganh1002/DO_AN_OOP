package Staff;
import java.util.Scanner;
public class QuanLy extends NhanVien {
    protected double HeSoChucVu; // ví dụ đặc trưng riêng của quản lý
    static protected String ChucVu =" Quản lý";
    public QuanLy() {
        super();
        HeSoChucVu = 0;
    }

    public QuanLy(String ten, String MaNV, double LuongCoBan, String NgaySinh, double HeSoChucVu) {
        super(ten, MaNV, LuongCoBan, NgaySinh);
        this.HeSoChucVu = HeSoChucVu;
    }

    @Override
    public void Nhap() {
        super.Nhap();

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hệ số chức vụ của quản lý: ");
        HeSoChucVu = sc.nextDouble();
        sc.nextLine();
    }
    public double TinhLuong() {
        return LuongCoBan * HeSoChucVu;
    }
    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Chức vụ: "+ChucVu);
        System.out.println("Hệ số chức vụ: " + HeSoChucVu);
        System.out.println("Tổng tiền lương: "+TinhLuong());
    }

    public double getHeSoChucVu() {
        return HeSoChucVu;
    }
}
