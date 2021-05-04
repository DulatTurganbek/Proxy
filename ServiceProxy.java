package Lab8;

import java.util.Scanner;

public class ServiceProxy implements Bank {
    String Username;
    int pin;
    private Service service;

    public ServiceProxy(Service service){
        this.service = service;
        this.pin = service.pin;
        this.Username = service.Username;
    }

    public void getSum() {
        System.out.println("The total amount of money in account: "+service.sum);
    }



    @Override
    public void deposit(int money) {
        if (check(this.pin)){
            this.service.deposit(money);
            getSum();
        }

    }

    @Override
    public void withdrawal(int money) {
        if (check(this.pin)){
            this.service.withdrawal(money);
            getSum();
        }

    }

    public boolean check(int pin) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Username: ");
        String str = in.next();
        System.out.println("Enter the pin: ");
        int num = in.nextInt();

        if (this.pin == num) {
            return true;
        }
        else {
            System.out.println("Pin code is not correct ");
            return false;
        }
    }
}
