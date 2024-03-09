package ra.entity;

import ra.itf.IStudent;

import java.util.Scanner;

public class Student implements IStudent {
    private String studentID;
    private String studentName;
    private int age;
    private float diemToan;
    private float diemLy;
    private float diemHoa;
    private float diemTB;
    private boolean status;

    public Student() {
    }

    public Student(String studentID, String studentName, int age, float diemToan, float diemLy, float diemHoa, float diemTB, boolean status) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.age = age;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.diemTB = diemTB;
        this.status = status;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = ((getDiemHoa()+getDiemLy()+getDiemToan()/3));
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sv :");
        studentID = scanner.nextLine();
        System.out.println("Nhập tên sv :");
        studentName = scanner.nextLine();
        System.out.println("nhập tuổi sv :");
        age = scanner.nextInt();
        System.out.println("Nhập điểm Toán");
        diemToan = scanner.nextInt();
        System.out.println("Nhập điểm Lý");
        diemLy = scanner.nextInt();
        System.out.println("Nhập điểm Hóa");
        diemHoa = scanner.nextInt();
    }
//    •	StudentId: String – Mã sinh viên
//•	StudentName: String – Tên sinh viên
//•	Age: int – Tuổi sinh viên
//•	DiemToan: float – điểm toán
//•	DiemLy: float – điểm lý
//•	DiemHoa: float – điểm hóa
//•	DiemTB: float – điểm trung bình
//•	Status: Boolean – Trạng thái sinh viên

    @Override
    public void displayData() {
        System.out.println("Mã sv là : "+studentID);
        System.out.println("Tên sv là : "+studentName);
        System.out.println("Tuổi sv là : "+age);
        System.out.println("Điểm Toán là :"+diemToan);
        System.out.println("Điểm Lý là :"+diemLy);
        System.out.println("Điểm Hóa là :"+diemHoa);
        System.out.println(" ");
    }

    public void avgData(){
        diemTB =((diemHoa+diemToan+diemLy)/3);
        System.out.println("Điểm trung bình của "+studentName+" là :"+ diemTB);
    }
    public void xetDiemSV(){
        if (diemTB>=MARK_PASS){
            System.out.println("Sinh viên "+studentName+" pass");
        }else {
            System.out.println("Sinh viên "+studentName+" fail  ");
        }
    }
}
