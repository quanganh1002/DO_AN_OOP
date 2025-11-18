package Agency;

public class CuaHang extends DaiLy {
    protected static String LoaiDL="Cửa hàng";
    public CuaHang(){
        super();
    }
    @Override
    public void Nhap() {
        super.Nhap();

    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Loại đại lý: "+LoaiDL);
    }

}
