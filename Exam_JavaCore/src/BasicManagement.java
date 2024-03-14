import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicManagement {
    public static List<Department> listDepartment = new ArrayList<>();
    public static List<Employee> listEmployee = new ArrayList<>();
    public static Department department = new Department();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
        //******************************
        System.out.println("*********************************MENU*******************************\n" +
                "1. Quản lý phòng ban\n" +
                "2. Quản lý nhân viên\n" +
                "3. Thoát chương trình");
        System.out.println("Mời baạn chọn");
        int choiceMenu = Integer.parseInt(scanner.nextLine());
        do {
            switch (choiceMenu){
                case 1:
                    boolean check1 = true;
                    do {
                        System.out.println("**********************DEPARTMENT-MENU************************\n" +
                                "1. Thêm mới phòng ban \n" +
                                "2. Hiển thị thông tin tất cả phòng ban \n" +
                                "3. Sửa tên phòng ban \n" +
                                "4. Xóa phòng ban \n" +
                                "5. Tìm kiếm phòng ban \n" +
                                "0. Quay lại");
                        System.out.println("Mời bạn chọn");
                        int choiceDepartment = Integer.parseInt(scanner.nextLine());
                        switch (choiceDepartment){
                            case 1:
                                System.out.println("Mời bạn nhập số lượng phòng ban muốn thêm mới");
                                int n = Integer.parseInt(scanner.nextLine());
                                for (int i = 0; i < n; i++) {
                                    Department department = new Department();
                                    department.inputDepartment(scanner);
                                    listDepartment.add(department);
                                }
                                break;
                            case 2:
                                System.out.println("Danh sách các phòng ban là:");
                                for (Department department : listDepartment) {
                                    department.outputDataDepartment();
                                }
                                break;
                            case 3:
                                System.out.println("Danh sách các phòng ban là:");
                                for (Department department : listDepartment) {
                                    department.outputDataDepartment();
                                }
                                updateDepartment();
                                break;
                            case 4:
                                deleteDepartment();
                                break;
                            case 5:
                                break;
                            case 0:
                                check1 = false ;
                                break;
                            default:
                                System.err.println("Không hợp lệ, mời nhập lại");
                        }
                    }while (check1);
                case 2:
                    boolean check2 = true;
                    do {
                        System.out.println("*************************EMPLOYEE-MENU**************************\n" +
                                "1. Thêm mới nhân viên\n" +
                                "2. Hiển thị thông tin tất cả nhân viên\n" +
                                "3. Xem chi tiết thông tin nhân viên\n" +
                                "4. Thay đổi thông tin nhân viên \n" +
                                "5. Xóa nhân viên \n" +
                                "6. Hiển thị danh sách nhân viên theo phòng ban \n" +
                                "7. Sắp xếp danh sách nhân viên \n" +
                                "0. Quay lại");
                        System.out.println("Mời bạn chọn");
                        int choiceEmplayee = Integer.parseInt(scanner.nextLine());
                        switch (choiceEmplayee){
                            case 1:
                                System.out.println("Mời bạn nhập số lượng nhân viên muốn thêm mới");
                                int n = Integer.parseInt(scanner.nextLine());
                                for (int i = 0; i < n; i++) {
                                    Employee employee = new Employee();
                                    employee.inpurDataEmployee();
                                    listEmployee.add(employee);
                                }
                                break;
                            case 2:
                                System.out.println("Danh sách các nhân viên là:");
                                for (Employee employee : listEmployee) {
                                    employee.outputDataEmployee();
                                }
                                break;
                            case 3:
                                System.out.println("Danh sách các nhân viên là:");
                                for (Employee employee : listEmployee) {
                                    employee.outputDataEmployees();
                                }
                                break;
                            case 4:
                                updateEmployee();
                                break;
                            case 5:
                                deleteEmployee();
                                break;
                            case 6:

                            case 7:

                                break;
                            case 0:
                                check2 = false ;
                                break;
                            default:
                                System.out.println("Bạn nhập không hợp lệ");
                        }
                    }while (check2);
                case 3:
                    System.exit(0);
            }
        }while (true);
        }while (true);
        //********************************* phần của Department*************************************

        //

    }

    public static void updateDepartment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn chọn Id phòng ban cần sửa");
        int departmentID = Integer.parseInt(scanner.nextLine());
        boolean checkDepartmentId = false;
        for (Department department : listDepartment) {
            if (department.getDepartmentId() == departmentID) {
                System.out.println("Mời bạn nhập tên phòng ban");
                department.setDepartmentName(scanner.nextLine());
                checkDepartmentId = true;
                break;
            }
        }
        if (checkDepartmentId == false) {
            System.out.println("????? Không tồn tại mã phòng ban bạn nhập ?????");
        }

    }

    public static void deleteEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã Id nhân viên bạn cần xóa");
        int employeeId = Integer.parseInt(scanner.nextLine());
        Employee employee1 = (Employee) finEmployeeById(employeeId);
        if (employee1 == null) {
            System.out.println("Không tìm thấy phòng bạn có mã Id bạn nhập");
        } else {
            listDepartment.remove(employee1);
            System.out.println("Xóa thành công");
        }

    }
    public static Department finEmployeeById(int employeeId) {
        for (Employee employee : listEmployee) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null;
    }



    public static void deleteDepartment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã Id phòng bạn cần xóa");
        int departmentID = Integer.parseInt(scanner.nextLine());
        Department department1 = finDepartmentById(departmentID);
        if (department1 == null) {
            System.out.println("Không tìm thấy phòng bạn có mã Id bạn nhập");
        } else {
            listDepartment.remove(department1);
            System.out.println("Xóa thành công");
        }

    }

    public static Department finDepartmentById(int departmentID) {
        for (Department department : listDepartment) {
            if (department.getDepartmentId() == departmentID) {
                return department;
            }
        }
        return null;
    }


    //*********************phần của Employee*******************************************
    public static void updateEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn chọn Id nhân viên cần sửa");
        int employeeId = Integer.parseInt(scanner.nextLine());
        boolean checkDepartmentId = false;
        for (Employee employee : listEmployee) {
            if (employee.getEmployeeId() == employeeId) {
                System.out.println("Mời bạn nhập tên phòng ban");
                employee.inpurDataEmployee();
                checkDepartmentId = true;
                break;
            }
        }
        if (checkDepartmentId == false) {
            System.out.println("????? Không tồn tại mã phòng ban bạn nhập ?????");
        }
    }

}
