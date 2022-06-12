import java.util.ArrayList;
import java.util.Scanner;

public abstract class Account implements Comparable<Account>,AccountService{
    private Scanner sc = new Scanner(System.in);
    private User user;

    public Account(User user) {
        this.user = user;
    }

    public abstract void addPolicy();
    public void addAddress(){
        AddressManager.addAddress(this.user);
    }

    public void deleteAddress(){
        printAddress();
        System.out.println("Enter the address id you want to delete: ");
        int deleteAddressId = sc.nextInt();
        AddressManager.deleteAddress(user,deleteAddressId);
    }

    public void login(String email, String password, Account account) throws InvalidAuthenticationException{
        if(account.getUser().getEmail().equals(email) && account.getUser().getPassword().equals(password)){
            AuthenticationStatus success = AuthenticationStatus.SUCCESS;
            System.out.println(success);
        }
        else{
            AuthenticationStatus fail = AuthenticationStatus.FAIL;
            throw new InvalidAuthenticationException("Login Failed" + fail);}

    }

    public void printAddress(){
        for(Address address: user.getAddressList()){
            address.showAddressInfo();
        }
    }

    public void printInsurances(){
        for(Insurance insurance: user.getInsuranceList()){
            System.out.println("Type of insurance: " + insurance.getInsuranceName() + "\n" +
                    " Insurance Fee: " + insurance.getInsuranceFee() + " Insurance Start Date: "
                    + insurance.getStartDate() + " Insurance Finish Date: " + insurance.getFinishDate());
        }
    }

    public final void showUserInfo(){
        System.out.println("Username, Surname : " +
                user.getFirstName() + " " +
                user.getLastName() +"\n Email: " +
                user.getEmail() + "Job: " + user.getJob() +
                "\n Age: " + user.getAge() );
        printAddress();
        printInsurances();
    }
    public User getUser() {
        return user;
    }
}
