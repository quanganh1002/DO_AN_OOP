package Staff;

public class CongNhan extends NhanVien {
    static protected String ChucVu="Công nhân";
    @Override
    public void Nhap() {
        super.Nhap();
    }
    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Chức vụ: "+ChucVu);
    }
}
