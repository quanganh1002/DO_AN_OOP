package Product;

public class SanPhamCaoCap extends SanPham{
    String ThoiGianBH;

    SanPhamCaoCap(){
        super();
        ThoiGianBH="";
    }
    SanPhamCaoCap(String Ten,String Ma,double Gia,String NgaySX,int SoLuong,String ThoiGianBH){
        super(Ten,Ma,Gia,NgaySX,SoLuong);
        this.ThoiGianBH=ThoiGianBH;
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Thời gian bảo hành của sản phẩm: "+ThoiGianBH);
    }

    @Override
    public void Nhap() {
        super.Nhap();
        sc.nextLine();
        System.out.print("Thời gian bảo hành: ");
        ThoiGianBH=sc.nextLine();
    }

    public String getThoiGianBH() {
        return ThoiGianBH;
    }
}
