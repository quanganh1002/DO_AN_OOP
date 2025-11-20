package Product;

public class SanPhamCaoCap extends SanPham{
    int ThoiGianBH;

    SanPhamCaoCap(){
        super();
        ThoiGianBH=0;
    }
    SanPhamCaoCap(String Ten,String Ma,double Gia,String NgaySX,int SoLuong,int ThoiGianBH){
        super(Ten,Ma,Gia,NgaySX,SoLuong);
        this.ThoiGianBH=ThoiGianBH;
    }

    @Override
    public void Xuat() {
        super.Xuat();
        sc.nextLine();
        System.out.println("Thời gian bảo hành của sản phẩm: "+ThoiGianBH+" Tháng");
        setThoiGianBH(sc.nextInt());
    }

    @Override
    public void Nhap() {
        super.Nhap();
        sc.nextLine();
        System.out.print("Thời gian bảo hành (Tháng): ");
    }

    public int getThoiGianBH() {
        return ThoiGianBH;
    }
    public void setThoiGianBH(int bh){
        if(bh>=0) ThoiGianBH=bh;
        else System.out.println("Thời gian bảo hành không hợp lệ!");
    }
}
