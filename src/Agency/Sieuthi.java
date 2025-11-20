package Agency;

public class Sieuthi extends DaiLy {
    protected static String LoaiDL="Siêu thị";
    protected int HopDong;

    public Sieuthi(){
        super();
        HopDong=0;
    }
    public Sieuthi(String ten,String diachi,String ma,String std,String email,int hopDong){
        super(ten,diachi,ma,std,email);
        this.HopDong=hopDong;
    }
    public void setHopDong(int hopDong) {
        if(hopDong>0) HopDong=hopDong;
        else System.out.println("Hạn hợp đồng không hợp lệ");
    }
    @Override
    public void Nhap() {
        super.Nhap();
        System.out.print("Nhập thời hạn hợp đồng(tháng): ");
        int hopDong = sc.nextInt();
        setHopDong(hopDong);
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Loại đại lý: "+LoaiDL);
        System.out.println("Hạn hợp đồng: "+HopDong+" tháng");
    }



    public int getHopDong(){
        return HopDong;
    }

}
