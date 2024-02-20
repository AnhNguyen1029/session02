public class bai6 {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên là:");
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            int kiemTraSoNguyenTo=0;
            for (int j = 1; j <= i ; j++) {
                if (i%j==0){
                    kiemTraSoNguyenTo++;
                }
            }
            if (kiemTraSoNguyenTo==2){
//                System.out.print(" "+i);
                sum++;
                if (sum<=20){
                    System.out.print(" "+i);
                }
            }
        }
    }
}
