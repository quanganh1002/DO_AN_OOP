package PhieuNhapXuat;
import java.util.Scanner;
public class PhieuNhap extends Phieu{
    protected String MaPN;
    protected String MaSP;
    protected int SoLuong;
    protected Scanner sc=new Scanner(System.in);
    PhieuNhap(){
        MaPN="";
        MaSP="";
        SoLuong=0;
    }
    PhieuNhap(String MaPN,String MaSP,int SoLuong){
        this.MaPN=MaPN;
        this.MaSP=MaSP;
        this.SoLuong=SoLuong;
    }

    public void setSoLuong(int soLuong) {
        if(soLuong>=0) SoLuong = soLuong;
        else System.out.println("Số lượng không hợp lệ");
    }

    @Override
    public void Nhap(){
        System.out.print("Mới bạn nhập mã nhiếu nhập: ");
        MaPN=sc.nextLine();
        System.out.print("Mời bạn nhập mã sản phẩm bạn cần nhập: ");
        MaSP=sc.nextLine();
        System.out.print("Mời bạn nhập số lượng sản phẩm: ");
        int soLuong=sc.nextInt();
        setSoLuong(soLuong);
    }
    @Override
    public void Xuat(){
        System.out.println("Mã phiếu nhập: "+MaPN);
        System.out.println("Mã sản phẩm: "+MaSP);
        System.out.println("Số lượng: "+SoLuong);
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public String getMaSP() {
        return MaSP;
    }

    public String getMaPN() {
        return MaPN;
    }

}
