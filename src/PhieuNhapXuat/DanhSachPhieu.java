package PhieuNhapXuat;
import Agency.DaiLy;
import Interface.ITinhNang;
import Product.SanPham;
import Product.DanhSachSP;
import Agency.DanhSachDL;
import java.util.ArrayList;
import java.util.Scanner;
public class DanhSachPhieu implements ITinhNang {
    private ArrayList<PhieuNhap> DanhSachPhieuNhap;
    private ArrayList<PhieuXuat> DanhSachPhieuXuat;
    private ArrayList<PhieuNhap> DanhSachPhieuNhapOld;
    private ArrayList<PhieuXuat> DanhSachPhieuXuatOld;
    public DanhSachPhieu(){
        DanhSachPhieuNhap=new ArrayList<>();
        DanhSachPhieuXuat=new ArrayList<>();
        DanhSachPhieuXuatOld=new ArrayList<>();
        DanhSachPhieuNhapOld=new ArrayList<>();
    }
    @Override
    public void Them() {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nBạn muốn thêm loại phiếu nào:");
            System.out.println("1. Phiếu nhập");
            System.out.println("2. Phiếu xuất");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn chọn: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    PhieuNhap p1=new PhieuNhap();
                    p1.Nhap();
                    DanhSachPhieuNhap.add(p1);
                    break;

                case 2:
                    PhieuXuat p2=new PhieuXuat();
                    p2.Nhap();
                    DanhSachPhieuXuat.add(p2);
                    break;

                case 0:
                    System.out.println("Thoát chức năng thêm.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, mời nhập lại!");
            }

        } while (choice != 0);
    }

    @Override
    public void Xem() {
        System.out.println("\n ========== Danh sách phiếu nhập ==========\n");
        for(Phieu p : DanhSachPhieuNhap) p.Xuat();
        System.out.println("\n ========== Danh sách phiếu xuất ==========\n");
        for(Phieu p:DanhSachPhieuXuat) p.Xuat();
    }

    @Override
    public void Xoa() {
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("Bạn muốn xóa loại phiếu nào: ");
            System.out.println("1. Phiếu nhập");
            System.out.println("2. Phiếu xuất");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn chọn: ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    boolean found=false;
                    System.out.print("Mời bạn nhập mã phiếu nhập bạn muốn xóa: ");
                    String ma=sc.nextLine();
                    for(PhieuNhap pn :DanhSachPhieuNhap){
                        if(pn.getMaPN().equalsIgnoreCase(ma)){
                            DanhSachPhieuNhap.remove(pn);
                            found = true;
                            break;
                        }
                    }
                    if(!found) System.out.println("Không tìm thấy phiếu nhập!");
                    break;
                case 2:
                    boolean found2 =false;
                    System.out.print("Nhập mã phiếu xuất bạn muốn xóa: ");
                    String ma2=sc.nextLine();
                    for(PhieuXuat px:DanhSachPhieuXuat){
                        if(px.getMaPX().equalsIgnoreCase(ma2)){
                            DanhSachPhieuXuat.remove(px);
                            found2=true;
                        }
                        if(!found2) System.out.println("Không tìm thấy phiếu xuất!");
                    }
                    break;
                case 0:
                    System.out.println("Thoát tính năng xóa");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        }while(choice!=0);
    }

    @Override
    public void Sua() {
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("Bạn muốn sửa loại phiếu nào: ");
            System.out.println("1. Phiếu nhập");
            System.out.println("2. Phiếu xuất");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn chọn: ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    boolean found=false;
                    System.out.print("Mời bạn nhập mã phiếu nhập bạn muốn sửa: ");
                    sc.nextLine();
                    String ma=sc.nextLine();
                    for(PhieuNhap pn :DanhSachPhieuNhap){
                        if(pn.getMaPN().equalsIgnoreCase(ma)){
                            pn.Nhap();
                            found = true;
                            break;
                        }
                    }
                    if(!found) System.out.println("Không tìm thấy phiếu nhập!");
                    break;
                case 2:
                    boolean found2 =false;
                    System.out.print("Nhập mã phiếu xuất bạn muốn sửa: ");
                    String ma2=sc.nextLine();
                    for(PhieuXuat px:DanhSachPhieuXuat){
                        if(px.getMaPX().equalsIgnoreCase(ma2)){
                            px.Nhap();
                            found2=true;
                        }
                        if(!found2) System.out.println("Không tìm thấy phiếu xuất!");
                    }
                    break;
                case 0:
                    System.out.println("Thoát tính năng sửa");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        }while(choice!=0);
    }

    @Override
    public void TimKiem() {
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("Bạn muốn tìm loại phiếu nào: ");
            System.out.println("1. Phiếu nhập");
            System.out.println("2. Phiếu xuất");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn chọn: ");

            choice=sc.nextInt();
            switch (choice){
                case 1:
                    boolean found=false;
                    System.out.print("Mời bạn nhập mã phiếu nhập bạn muốn tìm: ");
                    String ma=sc.nextLine();
                    for(PhieuNhap pn :DanhSachPhieuNhap){
                        if(pn.getMaPN().equalsIgnoreCase(ma)){
                            pn.Xuat();
                            found = true;
                            break;
                        }
                    }
                    if(!found) System.out.println("Không tìm thấy phiếu nhập!");
                    break;
                case 2:
                    boolean found2 =false;
                    System.out.print("Nhập mã phiếu xuất bạn muốn tìm: ");
                    String ma2=sc.nextLine();
                    for(PhieuXuat px:DanhSachPhieuXuat){
                        if(px.getMaPX().equalsIgnoreCase(ma2)){
                            px.Xuat();
                            found2=true;
                        }
                        if(!found2) System.out.println("Không tìm thấy phiếu xuất!");
                    }
                    break;
                case 0:
                    System.out.println("Thoát tính năng tìm kiếm");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        }while(choice!=0);
    }
    public void CapNhapSL(DanhSachSP qlsp, DanhSachDL qldl){
        System.out.println("Cập nhập phiếu nhập");
        for(PhieuNhap pn:DanhSachPhieuNhap){
            SanPham SP=qlsp.found(pn.getMaSP());
            if(SP==null) System.out.println("Không có sản phẩm "+pn.getMaSP()+" trong kho vui lòng cập nhập lại");
            else {
                SP.setSoLuong(SP.getSoLuong()+pn.getSoLuong());
            }
        }
        System.out.println("Cập nhập phiếu xuất");
        for(PhieuXuat px :DanhSachPhieuXuat){
            SanPham SP=qlsp.found(px.getMaSP());
            DaiLy dl= qldl.found(px.getMaDL());
            if(SP==null) System.out.println("Không có sản phâm "+px.getMaSP()+" trong kho vui lòng cập nhập lại");
            else if(SP.getSoLuong()< px.getSoLuong()) System.out.println("Sản phẩm "+px.getMaSP()+" không đủ số lượng để xuất ");
            else if(dl==null) System.out.println("Đại lý "+px.getMaDL()+" không có trong danh sách vui lòng cập nhập lại");
            else SP.setSoLuong(SP.getSoLuong()- px.getSoLuong());
        }
        System.out.println("Đã cập nhập số lượng kho hàng thành công");
        DanhSachPhieuNhapOld.addAll(DanhSachPhieuNhap);
        DanhSachPhieuXuatOld.addAll(DanhSachPhieuXuat);
        DanhSachPhieuNhap.clear();
        DanhSachPhieuXuat.clear();
    }
    public void Xuatold(){
        System.out.println("Danh sách phiếu nhập đã hoàn thành: ");
        for(PhieuNhap pn:DanhSachPhieuNhapOld) pn.Xuat();
        System.out.println("Danh sách phiếu xuất đã hoàn thành: ");
        for(PhieuXuat px:DanhSachPhieuXuatOld) px.Xuat();
    }
}
