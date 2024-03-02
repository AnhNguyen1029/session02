package baiTapVeNha;

import java.util.Scanner;

public class PesonAccount extends Account{
    private int fee;

    public PesonAccount() {
        super();
    }

    public PesonAccount(int accountNo, String customerName, int balance, int fee) {
        super(accountNo, customerName, balance);
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
    public void withDraw(){
        float withDrawMoney;
        Scanner scanner = new Scanner (System.in);
        do {
            System.out.println("Nhập số tiền cần rút: ");
            withDrawMoney = scanner.nextFloat();
            if (withDrawMoney <= 0) {
                System.out.println("Số tiền cần rút không hợp lệ");
            }
        }
        while (withDrawMoney <= 0);
        if (withDrawMoney < getBalance()){
            setBalance(getBalance() - withDrawMoney - fee);
            System.out.println("Rút tiền thành công, số dư tài khoản là"+getBalance());
        }else {
            System.out.println("Số dư tài khoản không đủ");
        }
    }
    public void deposite() {
        float depositeMoney;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số tiền cần gửi :");
            depositeMoney = scanner.nextFloat();
            ;
            if (depositeMoney <= 0) {
                System.out.println("Số tiền gửi không hợp lệ");
            }
        } while (depositeMoney <= 0);
        setBalance(getBalance() + depositeMoney);
        System.out.println("Số tiền trong tài khoản hiện tại là :" + getBalance());
    }

    @Override
    public String toString() {
        return "PesonAccount{" + super.toString() +
                "fee=" + fee +
                '}';
    }
}
