public class bai5 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là :");
        for (int i = 1; i < 100; i++) {
            int kiemTraSoNguyenTo=0;
            for (int j = 1; j <= i ; j++) {
                if (i%j==0){
                    kiemTraSoNguyenTo++;
                }
            }
            if (kiemTraSoNguyenTo==2){
                System.out.print(" "+i);
            }
        }
    }
}
