public class Main {
    public static void main(String[] args) {
        //khởi tạo đối tượng từ lớp Dog
        Dog dog1 = new Dog("vàng","chó ta",true,"Cậu Vàng");
        Dog dog2 = new Dog("đen","chó cảnh sát",false,"Join");


        //Truy cập vào thuộc tính
        System.out.println("chó 1 tên là "+dog1.name+" có màu lông là "+dog1.color);
        System.out.println("chó 2 tên là "+dog2.name+" có màu lông là "+dog2.color);



        //truy cập vào phương thức
        dog1.sua();
        dog2.sua();

    }
}
