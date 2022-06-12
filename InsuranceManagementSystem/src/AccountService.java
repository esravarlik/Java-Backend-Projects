public interface AccountService {
    public void addPolicy();
    public void addAddress();
    public void deleteAddress();
    public void login(String email, String password, Account account) throws InvalidAuthenticationException;
    public void printAddress();
    public void printInsurances();
    public void showUserInfo();

}
