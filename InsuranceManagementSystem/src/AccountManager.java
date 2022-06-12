
import java.time.LocalDate;
import java.util.TreeSet;

public class AccountManager {
    static TreeSet<Account> users = new TreeSet<>();

    public Account login(String email, String password) {
        try {
            for (Account acc : users) {
                if (acc.getUser().getEmail().equals(email) && acc.getUser().getPassword().equals(password)) {
                    acc.login(email, password, acc);
                    return acc;
                }
            }
            throw new InvalidAuthenticationException("FAIL");

        } catch (InvalidAuthenticationException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
