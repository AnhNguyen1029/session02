import java.util.Scanner;

public class Department {
    Scanner scanner = new Scanner(System.in);
    private int departmentId;
    private String departmentName;

    public void inputDepartment(Scanner scanner){
        System.out.println("Mời bạn nhập Id của phòng ban");
        departmentId = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên phòng ban");
        departmentName = scanner.nextLine();
        System.out.println("----------------");

    }
    public void outputDataDepartment(){
        System.out.println("ID phòng ban : "+departmentId+"\n"+
                "Tên phòng ban : "+departmentName+"\n"+
                "---------------"
        );
    }
    public void updateDepartment(){
        System.out.println("Mời bạn chọn Id phòng ban cần sửa");
        int departmentID = Integer.parseInt(scanner.nextLine());
    }


    public Department() {
    }

    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
