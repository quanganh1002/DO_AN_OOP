package Agency;
import Interface.INhapXuat;
import java.util.Scanner;

public class DaiLy implements INhapXuat {
Scanner sc = new Scanner(System.in);

protected String ten;
protected String ma_dl;
protected String dia_chi;
protected String sdt;
protected String email;

public DaiLy(String ten, String dia_chi, String ma_dl,String sdt, String email) {
    this.ten = ten;
    this.dia_chi = dia_chi;
    this.ma_dl = ma_dl;
    this.sdt=sdt;
    this.email = email;
}

public DaiLy() {
    ten = "";
    dia_chi = "";
    ma_dl = "";
    sdt = "";
    email = "";
}

@Override
public void Nhap() {
    System.out.print("Nhập tên đại lý: ");
    ten = sc.nextLine();
    System.out.print("Nhập địa chỉ đại lý: ");
    dia_chi = sc.nextLine();
    System.out.print("Nhập mã đại lý: ");
    ma_dl = sc.nextLine();
    System.out.print("Nhập số điện thoại: ");
    sdt = sc.nextLine();
    System.out.print("Nhập email: ");
    email = sc.nextLine();

}

@Override
public void Xuat() {
    System.out.println("\n==-THÔNG TIN ĐẠI LÝ-==");
    System.out.println("Tên: " + ten);
    System.out.println("Địa chỉ: " + dia_chi);
    System.out.println("Mã Đại lý: " + ma_dl);
    System.out.println("Số điện thoại: " + sdt);
    System.out.println("Email: " + email);
}



public String getTen() {
    return ten;
}

public String getDia_chi() {
    return dia_chi;
}

public String getMa_dl() {
    return ma_dl;
}

public String getSdt() {
    return sdt;
}

public String getEmail() {
    return email;
}


}
