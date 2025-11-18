package Agency;

public class Sieuthi extends DaiLy {
    protected static String LoaiDL="Siêu thị";
    protected int HopDong;
    Sieuthi(int HopDong){
        super();
        this.HopDong=HopDong;
    }
    Sieuthi(){
        super();
        HopDong=0;
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

   public void Sieuthi(String ten, String ma_dl, String dia_chi,String sdt, String email, int HopDong){
        super(ten,dia_chi,ma_dl,sdt,email);
        this.HopDong=HopDong;
   }

    public int getHopDong(){
        return HopDong;
    }

}
