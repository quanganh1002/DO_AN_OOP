package Economy;
import java.util.Scanner;
class Doanhthubandau extends Thongtintaichinhkho {
    Scanner sc=new Scanner(System.in);
     String doanhthutu;
     static protected String loai="Doanh thu";
    Doanhthubandau()
    {
        super();
        doanhthutu="";
    }
    Doanhthubandau(String ma, double Sotien, String doanhthutu) {
        super(ma,Sotien);
        this.doanhthutu=doanhthutu;
    }
    @Override
    public void Nhap() {
        super.Nhap();
        sc.nextLine();
        System.out.print("Xin mời nhập khoảng lợi nhuận từ đâu:");
        doanhthutu=sc.nextLine();
    }
    public void Xuat() {
        System.out.println("\n========== Thông tin doanh thu ==========");
        super.Xuat();
        System.out.print("Doanh thu từ:"+doanhthutu);
    }
    public void getloai()
    {
        System.out.print("Loại là:"+loai);
    }
    public String getDoanhthutu()
    {
        return  doanhthutu;
    }
}

