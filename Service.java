package Lab8;


public class Service implements Bank {
    int sum;
    String Username;
    int pin;

    public Service(int sum, String Username, int pin){
        this.sum = sum;
        this.pin = pin;
        this.Username = Username;
    }


    @Override
    public void deposit(int money) {
        sum = sum + money;
        System.out.println("completed successfully");


    }

    @Override
    public void withdrawal(int money) {
        if (sum >= money){
            sum = sum - money;
            System.out.println("completed successfully");}
        else {
            System.out.println("Not enough money to make this operation");
        }
    }
}