import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        //khai báo biến fullName
        String fullName="";
        //nhập giá trị cho biến fullName từ bàn phím
        //khoi tao doi tuong scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap Ten : ");
        fullName = scanner.nextLine();
        System.out.println("Xin chao"+ fullName);
        int age;
        System.out.println("Moi ban nhap so tuoi cua ban de biet nam sinh");
        age = scanner.nextInt();
        System.out.println("Ban sinh nam"+(2024-age));
        float height;
        System.out.println("Moi ban nhap chieu cao cua ban voi don vi cm");
        height = scanner.nextFloat();
        System.out.println("Ban cao :"+height+"cm");
        boolean sex;
        System.out.println("Moi ban nhap true neu ban la Nam false neu ban la Nu");
        sex = scanner.nextBoolean();
        System.out.println("gioi tinh cua ban la:"+(sex? "nam" : "nu"));

    }
}
