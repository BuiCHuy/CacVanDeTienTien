package maytinh_bonho;
public class MayTinh {
    public String Ten;
    public BoNho bn = new BoNho ("Ram",16);
    public void HienThiThongTin()
    {
        System.out.println("Ten may: "+ Ten);
        System.out.println("Thong tin bo nho:");
        System.out.println("Loai: "+bn.Loai);
        System.out.println("Dung luong: "+bn.DungLuong+"GB");
    }
    //constructor de test
    public MayTinh(String ten)
    {
        Ten = ten;
    }
}
