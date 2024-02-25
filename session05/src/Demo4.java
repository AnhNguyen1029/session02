import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Nhập vào số");
            String num = scanner.nextLine();
            //nguyen@gmail.com
            Pattern emailRegex = Pattern.compile("([a-z A-Z]+)(@)([a-z]).([a-z]{3,30})[.]([a-z]{1,4})");
            //09|03|07
//            Pattern phoneRegex = Pattern.compile("(0[379][0-9]{8})");
//            Pattern patternNum = Pattern.compile("a*b");// . là nhập gì cũng đúng
//        Pattern patternNum = Pattern.compile("x{3}");//nhập 3 dấu x mới true
//        Pattern patternNum = Pattern.compile("[0-9]{1,4}");//nhập số từ 0 đến 9 và ít nhất 1 số nhiều nhất 4 số
//        Pattern patternNum = Pattern.compile("[a-z 0-9]{1,4}");//nhập từ a đến z hoặc từ 0 đến 9
//        System.out.println(patternNum.matcher(num).find());
            Matcher check = emailRegex.matcher(num);
//        System.out.println(check.matches());//trả về boolean
            if (check.matches()) {
                break;
            } else {
                System.err.println("Sai định dạng mời nhập lại");
            }
        } while (true);
        System.out.println("Cám ơn bạn");
    }
}
