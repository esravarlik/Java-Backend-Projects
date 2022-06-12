import java.time.LocalDate;
import java.util.ArrayList;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String job;
    private int age;
    private Address address;
    private Insurance insurance;
    private LocalDate lastLogin;
    private ArrayList<Address> addressList = new ArrayList<>();
    private ArrayList<Insurance> insuranceList = new ArrayList<>();

    public User(String firstName, String lastName, String email, String password, String job, int age,Address address, LocalDate lastLogin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.address = address;
        this.addressList.add(address);
        this.lastLogin = lastLogin;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(ArrayList<Address> addressList) {
        this.addressList = addressList;
    }

    public LocalDate getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDate lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }

    public void setInsuranceList(Insurance insurance) {
        this.insuranceList.add(insurance);
    }

}
