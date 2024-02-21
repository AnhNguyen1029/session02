import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Bạn muốn mảng có bao nhiêu giá trị?");
        Scanner scanner=new Scanner(System.in);
        int num;
        num = scanner.nextInt();
        float[] number = new float[num];
        float avg = 0;
        System.out.println("hãy nhập từng giá trị cho mảng:");
        for (int i = 0; i < num; i++) {
            System.out.println("Giá trị thứ "+(i+1)+" của mảng:");
            number[i] = scanner.nextFloat();
            avg += number[i];
        }
        System.out.println("Trung Bình cộng của các phần tử trong mảng là : "+avg/num);
    }
}
