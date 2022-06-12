import java.util.Date;
import java.util.Scanner;

public class Enterprise extends Account {
    Scanner sc = new Scanner(System.in);
    protected Enterprise(User user) {
        super(user);
    }

    @Override
    public int compareTo(Account o) {
        return this.getUser().getFirstName().compareTo(o.getUser().getFirstName());
    }

    @Override
    public void addPolicy() {
        System.out.println("Insurance Business");
        System.out.println("1 Health Insurance " +
                "2 Residence Insurance " +
                "3 Travel Insurance " +
                "4 Car Insurance");
        System.out.print("Enter your insurance id: ");

        switch (sc.nextInt()) {
            case 1:
                if (checkInsurance(new HealthInsurance(1234,new Date(), new Date()))){
                    getUser().setInsurance(new HealthInsurance(1234,new Date(), new Date()));
                    getUser().setInsuranceList(getUser().getInsurance());
                    successInsuranceInfo();
                }else insuranceAvailable();

                break;
            case 2:
                if(checkInsurance(new ResidenceInsurance(1234,new Date(), new Date()))){
                    getUser().setInsurance(new ResidenceInsurance(1234,new Date(), new Date()));
                    getUser().setInsuranceList(getUser().getInsurance());
                    successInsuranceInfo();

                }else insuranceAvailable();
                break;
            case 3:
                if(checkInsurance(new TravelInsurance(1234,new Date(), new Date()))){
                    getUser().setInsurance(new TravelInsurance(1234,new Date(), new Date()));
                    getUser().setInsuranceList(getUser().getInsurance());
                    successInsuranceInfo();
                }else insuranceAvailable();

                break;
            case 4:
                if(checkInsurance(new CarInsurance(1234,new Date(), new Date()))){
                    getUser().setInsurance(new CarInsurance(1234,new Date(), new Date()));
                    getUser().setInsuranceList(getUser().getInsurance());
                    successInsuranceInfo();
                }else insuranceAvailable();

                break;
            default:
                insuranceAvailable();
                break;
        }

    }
    private boolean checkInsurance(Insurance insurance) {
        for(Insurance i:getUser().getInsuranceList()){
            if(i.getInsuranceName().equals(insurance.getInsuranceName())){
                return false;
            }
        }
        return true;
    }

    public void successInsuranceInfo(){
        System.out.println("New insurance created.");
    }

    public void insuranceAvailable() {
        System.out.println("Insurance Available");
    }
}
