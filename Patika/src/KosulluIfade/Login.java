package KosulluIfade;
import java.util.Scanner;

public class Login {
    
    public static void main(String[] args) {
        
        String userName, password;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter user name");
        userName = scan.next();
        System.out.println("Enter password");
        password = scan.next();

        if (userName.equals("ks") && password.equals("123")) {
            System.out.println("Login successful");
        } else if (userName.equals("ks")) {
            System.out.println("Login Failed!");


            System.out.println("Reset password?/n 1-Yes 2-No");

            int choose = scan.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Enter new password");
                    String newPassword = scan.next();

                    if (newPassword.equals("123")) {
                        System.out.println("Password can not changed, enter another password!");
                    } else {
                        System.out.println("New password created");
                    }
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("User name or password is incorrect!");
        }
    }
}
