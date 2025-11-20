package Staff;

public class CongNhan extends NhanVien {
    static protected String ChucVu="Công nhân";
    public CongNhan(){
        super();
    }
    public CongNhan(String ten,String MaNV,double luong,String Ns){
        super(ten,MaNV,luong,Ns);
    }
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
