import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        //lam 1 truong tinh xem phim
        //Nhap vao tuoi
        //Neu tuoi lown hon 18 thi se moi xem phim
        Scanner scanner=new Scanner(System.in);
        int age;
        System.out.println("Moi ban nhap vao tuoi nhe");
        age = scanner.nextInt();
        /*if (age >= 18){
            System.out.println("Moi ban xem phim");
        }else {
            System.out.println("Ban chua du tuoi");
        }*/
        //Yeu cau neu tuoi lon hon 18 thi moi xem phim , neu tuoi lon hon 16 thi moi xem kiem hiep, neu tuoi nho hon 16 thi xem doraemon
        if (age >=18){
            if (age > 65){
                System.out.println("Moi ban xem cai luong");
            }else {
                System.out.println("Moi ban xem phim");
            }
        } else if (age >= 16) {
            System.out.println("Moi ban xem phim kiem hiep");
        }else {
            System.out.println("Moi ban xem doraemon thoi ban nhe");
        }
    }
}
