package baiTapVeNha;

import java.util.Scanner;

public class SavingAccount extends Account{
    private double rate;
    private int period;

    public SavingAccount() {
        super();
    }

    public SavingAccount(int accountNo, String customerName, int balance, float rate, int period) {
        super(accountNo, customerName, balance);
        this.rate = rate;
        this.period = period;
    }

    public double getRate(int period) {
        if (period <= 1) {
            return 5.0;
        }
        if (period <= 3) {
            return 5.5;
        }
        if (period <= 6) {
            return 6;
        }
        if (period <= 12) {
            return 7;
        }
        if (period <= 24) {
            return 7.5;
        }
        if (period <= 36) {
            return 8;
        } else {
            return 1.8;
        }
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "SavingAccount{" + super.toString() +
                "rate=" + rate +
                ", period=" + period +
                '}';
    }
    public double checkInterest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ky han ban muon gui:");
        int period1 = scanner.nextInt();
        double rate1 = getRate(period1);
        System.out.println("Lai suat theo ky han la: " + rate1);
        double interset = getBalance() * period1 * rate1 / 100;
        System.out.print("Tien lai theo ky han vua nhap la: ");
        return interset;
    }
}
