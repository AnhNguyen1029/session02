public class Demo3 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
//        System.out.println(buffer.append(" X"));
//        buffer.delete(0,1);
//        System.out.println(buffer);
        buffer.append("A");
        buffer.append("Nguyễn Văn A");
        buffer.append("Nguyễn Văn A A A A");
        System.out.println("Trả về dung lượng b nhớ đệm "+ buffer.capacity());
    }
}
