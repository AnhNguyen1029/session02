package ra.Demo3;

public class NguoiGiau extends ConNguoi{
    private String nguoiYeu;

    public NguoiGiau() {
    }

    public NguoiGiau(String hoTen, String nguoiYeu) {
        super(hoTen);
        this.nguoiYeu = nguoiYeu;
    }


    @Override
    public void an() {
        super.an();
        System.out.println("ăn cùng "+nguoiYeu);
    }
}
