package Agency;

public class CuaHang extends DaiLy {
    protected static String LoaiDL="Cửa hàng";
    public CuaHang(String ten,String dc,String ma,String std,String email){
        super(ten,dc,ma,std,email);
    }
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
