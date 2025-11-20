package Economy;
import java.util.Scanner;
class Von extends Thongtintaichinhkho {
            Scanner sc=new Scanner(System.in);
             String Nguonvon;
             static protected String loai="Vốn";
           public Von()
            {
                super();
                Nguonvon="";
            }

           public Von(String mavon,double sotien ,String Nguonvon)
            {
                    super(mavon,sotien);
                    this.Nguonvon=Nguonvon;
            }
            @Override
            public void Nhap()
            {
                super.Nhap();
                System.out.print("Xin mời nhập nguồn vốn: ");
                Nguonvon=sc.nextLine();
            }
            public void Xuat() {
                System.out.println("\n========== Vốn của kho==========" );
                super.Xuat();
                System.out.println("Nguồn vốn là: "+Nguonvon);
            }
            public String getNguonvon()
            {return Nguonvon;}
}

