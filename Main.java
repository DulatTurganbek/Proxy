package Lab8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service Person = new Service(500000000,"Dulat",7585);
        ServiceProxy proxy = new ServiceProxy(Person);

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome there are our services:");
        while (true){
            System.out.println("Deposit ->1");
            System.out.println("Withdrawal ->2");
            System.out.println("Exit ->0");
            int a = in.nextInt();


            if (a == 1){
                System.out.println("Enter the amount of money to deposit:");
                proxy.deposit(in.nextInt());

            }

            else if (a == 2){
                System.out.println("Enter the amount of withdraw cash:");
                proxy.withdrawal(in.nextInt());
            }

            else if (a == 0){
                break;
            }

            else{
                System.out.println("Invalid please try again!!!");
            }
        }





    }
}
