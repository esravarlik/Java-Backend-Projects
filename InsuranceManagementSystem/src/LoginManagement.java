
import java.util.Scanner;

public class LoginManagement {
    Scanner sc = new Scanner(System.in);
    Scanner input=new Scanner(System.in);
    AccountManager accountManager = new AccountManager();

    public void login(){
        System.out.println("Welcome to the System!");
        System.out.println("Enter your email address: ");
        String email = input.next();
        System.out.println("Enter your password: ");
        String password = input.next();
        Account loginAccount = accountManager.login(email, password);
        if(loginAccount != null){
            AuthenticationStatus status = AuthenticationStatus.SUCCESS;
            System.out.println(status);
            loginAccount.showUserInfo();
            run(loginAccount);
        }else{
            AuthenticationStatus fail = AuthenticationStatus.FAIL;
            System.out.println(fail);
        }
    }

    private void run(Account account){
        while (true){

            System.out.println("---------INSURANCE SYSTEM---------");
            System.out.println("1 Show User Info\n" +
                    "2 Create New Insurance\n" +
                    "3 Add Address\n" +
                    "4 Delete Address\n" +
                    "0 Exit");

            System.out.print("Enter the process id: ");
            int value=sc.nextInt();
            switch (value) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    account.showUserInfo();
                    break;
                case 2:
                    account.addPolicy();
                    break;
                case 3:
                    account.addAddress();
                    break;
                case 4:
                    account.deleteAddress();
                    break;
            }
        }
    }
}
