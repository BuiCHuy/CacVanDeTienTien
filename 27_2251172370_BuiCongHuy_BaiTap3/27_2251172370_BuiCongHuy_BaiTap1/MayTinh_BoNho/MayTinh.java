package maytinh_bonho;
public class MayTinh {
    public String Ten;
    
    public void HienThiThongTin()
    {
        System.out.println("Ten may: "+ Ten);
        System.out.println("Thong tin bo nho:");
        System.out.println("Loai: "+BoNho.Loai);
        System.out.println("Dung luong: "+BoNho.DungLuong+"GB");
    }
    //constructor de test
    public MayTinh(String ten)
    {
        public BoNho BoNho = new BoNho ("Ram",16);
        Ten = ten;
    }
}
