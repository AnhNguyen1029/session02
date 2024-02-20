import java.util.Scanner;

public class bangCuuChuong {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*int number;
        number = scanner.nextInt();
        for (int i=1; i <= 10; i++){
            System.out.println(number+"X"+i+"="+number*i);
        }

         */
        for (int i = 0; i <=10 ; i++) {
            System.out.println("Bang cuu chuong" + i);
            for (int j = 0; j <=10 ; j++) {
                System.out.println(i+"X"+j+"="+j*i);
            }
        }
    }
}
