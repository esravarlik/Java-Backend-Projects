import java.util.Date;

public class TravelInsurance extends Insurance{
    public double loanAmount = 1.18;
    public TravelInsurance(double insuranceFee, Date startDate, Date finishDate) {
        super("Travel Insurance", startDate, finishDate);
        this.setInsuranceFee(calculate(insuranceFee));
    }

    @Override
    public double calculate(double amount) {
        double totalLoan = amount*loanAmount;
        System.out.println("Travel Insurance Total Loan: " + totalLoan);
        return totalLoan;
    }
}

