import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class Employee extends Department{
    private int employeeId;
    private String employeeName;
    private String email;
    private String phoneNumber;
    private String address;
    private boolean gender = true ;
    private Date birthday;
    private float basicSalary;
    private float allowanceSalary;
    private float rate;
//    private int departmentId;
    public void inpurDataEmployee(){
        System.out.println("Mời bạn nhập mã nhân viên");
        employeeId = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên nhân viên");
        employeeName = scanner.nextLine();
        System.out.println("Mời bạn nhập email");
        email = scanner.nextLine();
        System.out.println("Mời bạn nhập số điện thoại");
        phoneNumber = scanner.nextLine();
        System.out.println("Mời bạn nhập địa chỉ thường trú");
        address = scanner.nextLine();
        System.out.println("Mời bạn nhập true cho nam hoặc false cho nữ");
        gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Mời bạn nhập ngày tháng năm sinh");
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Mời bạn nhập lương cơ bản");
        basicSalary = Float.parseFloat(scanner.nextLine());
        System.out.println("Mời bạn nhập phụ cấp");
        allowanceSalary = Float.parseFloat(scanner.nextLine());
        System.out.println("Mời bạn nhập hệ số lương");
        rate = Float.parseFloat(scanner.nextLine());
        System.out.println("Mời bạn nhập Id phòng ban làm việc");
        setDepartmentId(Integer.parseInt(scanner.nextLine()));
    }
    public void outputDataEmployee(){
        String trangThai = (gender? "Nam" : "Nữ");
        System.out.println("Mã nhân viên : "+employeeId+"\n"+
                "Tên nhân viên : "+employeeName+"\n"+
                "Giới tính : "+gender+"\n"+
                "Id phòng ban làm viêc : "+getDepartmentId()+"\n"+
                "---------------"
        );
    }
    public void outputDataEmployees(){
        String trangThai = (gender? "Nam" : "Nữ");
        System.out.println("Mã nhân viên : "+employeeId+"\n"+
                "Tên nhân viên : "+employeeName+"\n"+
                "email : "+email+"\n"+
                "Số điện thoai : "+phoneNumber+"\n"+
                "Địa chỉ thường trú : "+address+"\n"+
                "Giới tính : "+gender+"\n"+
                "Ngày sinh : "+birthday+"\n"+
                "lương cơ bản : "+basicSalary+"\n"+
                "Phụ cấp : "+allowanceSalary+"\n"+
                "Hệ số lương : "+rate+"\n"+
                "Id phòng ban làm viêc : "+getDepartmentId()+"\n"+
                "---------------"
        );
    }

    public Employee(int departmentId, String departmentName) {
        super(departmentId, departmentName);
    }

    public Employee() {
    }

    public Employee(int departmentId, String departmentName, int employeeId, String employeeName, String email, String phoneNumber, String address, boolean gender, Date birthday, float basicSalary, float allowanceSalary, float rate, int departmentId1) {
        super(departmentId, departmentName);
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.birthday = birthday;
        this.basicSalary = basicSalary;
        this.allowanceSalary = allowanceSalary;
        this.rate = rate;
//        this.departmentId = departmentId1;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    public float getAllowanceSalary() {
        return allowanceSalary;
    }

    public void setAllowanceSalary(float allowanceSalary) {
        this.allowanceSalary = allowanceSalary;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

//    public int getDepartmentId() {
//        return departmentId;
//    }
//
//    public void setDepartmentId(int departmentId) {
//        this.departmentId = departmentId;
//    }

    public void calTotalSalary(){
        float calTotalSalary = basicSalary * rate + allowanceSalary;
        System.out.println("Tổng lương nhân viên là : "+calTotalSalary);
    }
}
