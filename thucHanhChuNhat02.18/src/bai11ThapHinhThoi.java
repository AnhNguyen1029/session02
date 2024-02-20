public class bai11ThapHinhThoi {
    public static void main(String[] args) {
//        String space ;
        int n = 7 ;
        for (int i = 1; i <= (2*n-1) ; i++) {
            int check =i <= n ? i : 2 * n - i;
            for (int j = 1; j <= n-check ; j++) {
                System.out.print("  ");
            }
            for (int k = check; k >= 1 ; k--) {
                System.out.print(k+" ");
            }
            for (int k = 2; k <= check ; k++) {
                System.out.print(k+" ");
            }

            System.out.println();
        }
    }
}
