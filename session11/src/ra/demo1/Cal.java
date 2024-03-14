package ra.demo1;

public class Cal {
    private int num1;
    private int num2;

    public Cal() {
    }

    public Cal(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void sum(){
        System.out.println(num1/num2);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) throws Exception {
        if (num2==0){
            throw new Exception("Số chia phải khác 0");
        }
        this.num2 = num2;
    }
}
