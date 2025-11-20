package Economy;
import Interface.*;
import java.util.Scanner;
public class Thongtintaichinhkho implements INhapXuat {
      protected  String ma;
      protected  double Sotien;
    Scanner sc=new Scanner(System.in);
           public Thongtintaichinhkho()
        {
            Sotien=0.0;
            ma=" ";
        }
        public Thongtintaichinhkho(String ma, double Sotien)
        {
            this.ma=ma;
            this.Sotien=Sotien;
        }

       @Override
        public void Nhap()
        {
                System.out.print("Xin mời nhập mã (Ví dụ TC001): ");
                setMa(sc.nextLine());
                System.out.print("Xin mời nhập số tiền(nghìn đồng): ");
                Sotien=sc.nextDouble();
        }
        @Override
        public void Xuat()
        {
           System.out.println("Mã thông tin là: "+ma);
           System.out.println("Số tiền là(nghìn đồng): "+Sotien);
        }

        public String getma()
        {return  ma;}
        public double getSotien()
        {return Sotien;}

    public void setMa(String ma) {
        if(ma.contains("TC")){
            this.ma=ma;
        }
        else System.out.println("Mã tài chính bị Không hợp lệ!");
    }
}
