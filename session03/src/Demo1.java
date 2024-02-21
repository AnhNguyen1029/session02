public class Demo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i < 8){
                continue;
                //continue là bỏ qua vòng lặp hiện tại và nhảy đến vòng lặp tiếp theo
            }
            System.out.println(i);
        }
    }
}
