public class Dog {
    //thuộc tính or trường
    public String color;
    public String type;
    public boolean sex;
    public String name;

    //Phương thức khởi tạo không tham số
    public Dog() {

    }


    //Phương thwucs khởi tạo đủ tham số

    public Dog(String color,String type,Boolean sex,String name) {
        this.color = color ;
        this.type = type ;
        this.sex = sex ;
        this.name = name ;

    }


    //Phương thức
    public void sua(){
        System.out.println(name+" đang sủa");
    }


}
