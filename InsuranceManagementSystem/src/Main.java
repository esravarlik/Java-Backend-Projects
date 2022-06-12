import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Address address = new HomeAddress("erz","turkey","address");
        User user1 = new User("esra","varlik","e@gmail.com","987","developer",24,address, LocalDate.now());
        Account account = new Individual(user1);

        Address address2 = new HomeAddress("ist","turkey","address");
        User user2 = new User("esra","varlik","es@gmail.com","987","developer",24,address2,LocalDate.now());
        Account account2 = new Enterprise(user2);
        AccountManager.users.add(account);
        AccountManager.users.add(account2);

        LoginManagement loginManagement = new LoginManagement();
        loginManagement.login();

    }
}