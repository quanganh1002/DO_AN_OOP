package Agency;
import Interface.ITinhNang;
import Product.SanPham;
import Product.SanPhamCaoCap;
import Product.SanPhamPhoThong;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachDL implements ITinhNang {
    Scanner sc=new Scanner(System.in);
    private ArrayList<DaiLy> danh_sach_dai_ly;

    public DanhSachDL() {
        danh_sach_dai_ly = new ArrayList<>();
    }

    @Override
    public void Them() {
        int choice;
        do{
            System.out.println("\n====-Chọn đại lý muốn thêm-====");
            System.out.println("1.Siêu Thị");
            System.out.println("2.Cửa Hàng");
            System.out.println("0.Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    Sieuthi st = new Sieuthi();
                    st.Nhap();
                    DaiLy dl= found(st.getMa_dl());
                    if(dl!=null) System.out.println("Đã có đại lý có mã này rồi!");
                    else{
                        danh_sach_dai_ly.add(st);
                        System.out.println("==-Đã thêm siêu thị-==");
                    }
                    break;
                case 2:
                    CuaHang ch = new CuaHang();
                    ch.Nhap();
                    DaiLy dl1=found(ch.getMa_dl());
                    if(dl1!=null) System.out.println("Đã có đại lý có mã này rồi");
                    else{
                        danh_sach_dai_ly.add(ch);
                        System.out.println("==-Đã thêm cửa hàng-==");
                    }
                    break;
                case 0:
                    System.out.println("Đã thoát thêm!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, mời nhập lại!");
            }
        }while( choice!=0);
    }

    @Override
    public void Sua(){
        System.out.print("Nhập mã đại lý muốn sửa: ");
        String ma_dl=sc.nextLine();
        boolean found=false;
        for(DaiLy dl:danh_sach_dai_ly){
            if(dl.getMa_dl().equalsIgnoreCase(ma_dl)){
                dl.Nhap();
                found=true;
            }
        }
        if(!found)System.out.println("không có đại lý trong danh sách!");
    }

    @Override
    public void Xoa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã đại lý bạn cần xóa: ");
        String ma = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < danh_sach_dai_ly.size(); i++) {
            DaiLy dl = danh_sach_dai_ly.get(i);

            if (dl.getMa_dl().equalsIgnoreCase(ma)) {

                // Xóa khỏi danh sách tổng
                danh_sach_dai_ly.remove(i);


                System.out.println("Xóa đại lý thành công!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy đại lý trong dữ liệu!");
        }
    }

    @Override
    public void TimKiem() {
        System.out.print("Nhập mã đại lý muốn tìm: ");
        String ma_dl=sc.nextLine();
        boolean found=false;
        for(DaiLy dl:danh_sach_dai_ly){
            if(dl.getMa_dl().equalsIgnoreCase(ma_dl)){
                dl.Xuat();
                found=true;
            }
        }
        if(!found)System.out.println("không có đại lý trong danh sách!");

    }

    @Override
    public void Xem() {
        if(danh_sach_dai_ly.isEmpty()){
            System.out.println("Không có đại lý nào trong dữ liệu!");
            return;
        }
        for(DaiLy dl:danh_sach_dai_ly) dl.Xuat();
    }
    public DaiLy found(String ma){
        for(DaiLy dl:danh_sach_dai_ly){
            if(dl.getMa_dl().equalsIgnoreCase(ma)) return dl;
        }
        return null;
    }
    public void ghiFile() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("DaiLy.txt"));
            for (DaiLy dl : danh_sach_dai_ly) {
                if(dl.getMa_dl().isEmpty())continue;

                if (dl instanceof Sieuthi) {
                    pw.println("SIEUTHI");
                    pw.println(dl.getTen());
                    pw.println(dl.getMa_dl());
                    pw.println(dl.getDia_chi());
                    pw.println(dl.getSdt());
                    pw.println(dl.getEmail());
                    pw.println(((Sieuthi) dl).getHopDong());
                } else {
                    pw.println("CUAHANG");
                    pw.println(dl.getTen());
                    pw.println(dl.getMa_dl());
                    pw.println(dl.getDia_chi());
                    pw.println(dl.getSdt());
                    pw.println(dl.getEmail());
                }
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }
    public void docFile() {
        danh_sach_dai_ly.clear();
        try {
            Scanner sc = new Scanner(new File("DaiLy.txt"));

            while (sc.hasNextLine()) {
                String loai = sc.nextLine();
                String ten = sc.nextLine();
                String diachi=sc.nextLine();
                String ma = sc.nextLine();
                String sdt =sc.nextLine();
                String email=sc.nextLine();

                if (loai.equals("SIEUTHI")) {
                    int hopdong = Integer.parseInt(sc.nextLine());
                    danh_sach_dai_ly.add(new Sieuthi(ten,diachi,ma,sdt,email,hopdong));
                } else {
                    danh_sach_dai_ly.add(new CuaHang(ten, diachi, ma, sdt, email));
                }
            }

            sc.close();

        } catch (Exception e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }

}


