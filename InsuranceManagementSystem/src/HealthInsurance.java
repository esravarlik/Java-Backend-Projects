import java.util.Date;

public class HealthInsurance extends Insurance{
    public double loanAmount = 1.08;

    public HealthInsurance( double insuranceFee, Date startDate, Date finishDate) {
        super("Health Insurance",startDate, finishDate);
        this.setInsuranceFee(calculate(insuranceFee));
    }

    @Override
    public double calculate(double amount) {
        double totalLoan = amount*loanAmount;
        System.out.println("Health Insurance Total Loan: " + totalLoan);
        return totalLoan;
    }
}


