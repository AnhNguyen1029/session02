package ra.demo1;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num;

        try {
            num1 = Integer.parseInt(scanner.nextLine());
        }catch (Exception exception){
            System.out.println("Sai định dạng");
        }




        try{
            num = Integer.parseInt(scanner.nextLine());
            System.out.println(num1/num);
        } catch (ArithmeticException arithmeticException){
            System.out.println("không thể chia ết cho 0");
        } catch (Exception exception){
            System.out.println("sai định dạng");
        }



    }
}
