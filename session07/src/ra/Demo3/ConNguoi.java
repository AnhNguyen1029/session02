package ra.Demo3;

public class ConNguoi {
    private String hoTen;

    public ConNguoi() {
    }

    public ConNguoi(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public void an(){
        System.out.println(hoTen+" đang ăn");
    }
}
