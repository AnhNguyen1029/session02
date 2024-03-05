package Ra.demo1;

public class Demo3 {
    private String demo3;
    public static class Demo4{
        private static String demo4 = "demo4";

        public Demo4() {
            System.out.println("oke");
        }
    }

    public static void main(String[] args) {
        System.out.println(Demo4.demo4);
    }
}
