import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Individual extends Account {

    Scanner sc = new Scanner(System.in);
    protected Individual(User user) {
        super(user);
    }

    @Override
    public void addPolicy(){
        System.out.println("Insurance Business");
        System.out.println("1 Health Insurance " +
                "2 Residence Insurance " +
                "3 Travel Insurance " +
                "4 Car Insurance");
        System.out.print("Enter your insurance id: ");

        switch (sc.nextInt()){
            case 1:
                getUser().setInsurance(new HealthInsurance(1255, new Date(),new Date()));
                getUser().setInsuranceList(getUser().getInsurance());
                printInsuranceInfo();
                break;
            case 2:
                getUser().setInsurance(new ResidenceInsurance(1255, new Date(),new Date()));
                getUser().setInsuranceList(getUser().getInsurance());
                printInsuranceInfo();
                break;
            case 3:
                getUser().setInsurance(new TravelInsurance(1255, new Date(),new Date()));
                getUser().setInsuranceList(getUser().getInsurance());
                printInsuranceInfo();
                break;
            case 4:
                getUser().setInsurance(new CarInsurance(1255, new Date(),new Date()));
                getUser().setInsuranceList(getUser().getInsurance());
                printInsuranceInfo();
                break;
            default:
                System.out.println("Invalid Id.");
                break;
        }
    }

    public void printInsuranceInfo(){
        System.out.println("Your insurance transaction has been completed.");
    }
    @Override
    public int compareTo(Account o) {
        return this.getUser().getFirstName().compareTo(o.getUser().getFirstName());
    }
}
