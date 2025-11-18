package Product;

public class SanPhamPhoThong extends SanPham{
    SanPhamPhoThong(){super();}
    SanPhamPhoThong(String ten,String ma,double gia,String NgaySX,int SoLuong){
        super(ten,ma,gia,NgaySX,SoLuong);
    }
    @Override
    public void Nhap() {
        super.Nhap();
    }
    @Override
    public void Xuat() {
        super.Xuat();
    }
}
