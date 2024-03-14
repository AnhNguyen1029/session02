package ra.demo2;

public interface Iphone {
    void call();
    default void sendMess(){
        System.out.println("gửi");
    }

}
