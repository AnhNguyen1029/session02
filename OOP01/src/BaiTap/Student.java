package BaiTap;

import java.util.Scanner;

public class Student {
    private String msv;
    private String fullName;
    private boolean sex;

    public Student(){

    }

    public Student(String msv, String fullName, boolean sex){
        this.msv = msv;
        this.fullName = fullName;
        this.sex = sex;
    }

    public void showInfo(){
        System.out.printf("\tMã sinh viên là :"+ msv);
        System.out.printf("\tTên sinh viên là :"+ fullName);
        System.out.printf("\tGiới tính là : %s", sex ? "nam" : "nữ");
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập mã sinh viên");
        msv = scanner.nextLine();
        //student1.setMsv(student1MSV);
        System.out.println("Mời bạn nhập Họ và Tên");
        fullName = scanner.nextLine();
        //student1.setFullName(student1Name);
        System.out.println("mời bạn nhập giới tính true nếu là nam hoặc false nếu là nữ");
        sex = scanner.nextBoolean();
        //student1.setSex(student1Sex);
    }
}
