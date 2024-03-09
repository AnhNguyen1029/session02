import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaiTap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Quan ly thong tin cua 1 sinh vien
//        =====Bài tâp===
//        1. Nhap vao ma sinh vien
//        2. Nhap vao ho ten
//        3. số điện thoại
//        4. Nhập vào ngày tháng năm sinh
//        5. In thông tin sinh vien
//
//        Validate dữ liệu nhập vào
//        mã sinh viên phải bắt đầu bằng chữ B sau là 3 số (VD : B200)
//        Ho ten khong chua ky tu dac biet trừ khoảng trắng có tối thiểu 10 ký tự
//        Phone Đúng định dạng Đông Lào
//        Năm sinh phải đúng yy/mmm/dd (1994/10/05)
        ///cau1  ****************************************
        System.out.println("Mời bạn nhập mã sinh viên :");
        String maSinhVien;
        do {
            maSinhVien = scanner.nextLine();
            Pattern maSinhVienRegex = Pattern.compile("B[0-9]{3}");
            Matcher check1 = maSinhVienRegex.matcher(maSinhVien);
            if (check1.matches()) {
                break;
            } else {
                System.err.println("Sai định dạng mời nhập lại");
            }
        } while (true);
        //cau 2 *****************************************************
        System.out.println("Mời bạn nhập Hò và Tên");
        String name;
        do {
            name = scanner.nextLine();
            Pattern nameRegex = Pattern.compile("[a-z A-Z]{10,}");
            Matcher check2 = nameRegex.matcher(name);
            if (check2.matches()) {
                break;
            } else {
                System.err.println("Sai định dạng mời nhập lại");
            }
        } while (true);
        //cau3 ***************************************
        System.out.println("Mời bạn nhập số điện thoại");
        String phone;
        do {
            phone = scanner.nextLine();
            Pattern phoneRegex = Pattern.compile("0[379][0-9]{8}");
            Matcher check3 = phoneRegex.matcher(phone);
            if (check3.matches()) {
                break;
            } else {
                System.err.println("Sai định dạng mời nhập lại");
            }
        } while (true);
        //cau4*********************************************
        System.out.println("Mời bạn ngày tháng năm sinh theo dạng yy/mm/dd");
        String birthday;
        do {
            birthday = scanner.nextLine();
            Pattern birthdayRegex = Pattern.compile("[0-9]{4}/[0-9]{2}/[0-9]{2}");
            Matcher check4 = birthdayRegex.matcher(birthday);
            if (check4.matches()) {
                break;
            } else {
                System.err.println("Sai định dạng mời nhập lại");
            }
        } while (true);
        //cau5******************************************
        System.out.println("Thông tin sinh viên");
        System.out.println("Mã sinh viên : " + maSinhVien);
        System.out.println("Họ Tên sinh viên : " + name);
        System.out.println("Số điện thoại sinh viên : " + phone);
        System.out.println("Ngày tháng năm sinh của sinh viên : " + birthday);

    }
}
