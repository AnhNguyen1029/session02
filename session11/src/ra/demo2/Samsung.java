package ra.demo2;

public class Samsung implements Iphone{

    @Override
    public void call() {

    }

    @Override
    public void sendMess() {
        Iphone.super.sendMess();
    }
}
