package Ra.demo1;

public class Demo2 {
    private  static  int num = 1;
    static {
        System.out.println("CHạy trớc main");
    }
    static {
        num = 100;
    }
    static {
        System.out.println("trước phương thức khởi tạo");
    }
    public Demo2(){
        System.out.println("phương thức khởi tạo");
    }

    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
        System.out.println("ok");
    }
}
