package Economy;
import java.util.Scanner;

 class Thue extends Thongtintaichinhkho {
    Scanner sc=new Scanner(System.in);
      double thuesuat;
      static protected String loai="Thuế";
        Thue()
        {
            super();
            thuesuat=0.0;
        }
        Thue(String mathue,double Sotien,double thuesuat)
        {
            super(mathue,Sotien);
            this.thuesuat=thuesuat;
        }
        @Override
        public void Nhap()
        {
            super.Nhap();
            System.out.print("Xin mời nhập thuế suất (%):");
            thuesuat=sc.nextDouble();
        }
        public void Xuat() {
         System.out.println("\n========== Thông tin thuế ==========");
         super.Xuat();
         System.out.println("Số thuế suất là: "+thuesuat+" %");
     }
        public  double getThuesuat()
        {return thuesuat;}
 }
