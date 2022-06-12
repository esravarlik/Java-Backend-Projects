import java.nio.file.AccessMode;
import java.util.Date;

public class ResidenceInsurance extends Insurance{
    public double loanAmount = 1.15;

    public ResidenceInsurance( double insuranceFee, Date startDate, Date finishDate) {
        super("Residence Insurance", startDate, finishDate);
        this.setInsuranceFee(calculate(insuranceFee));
    }

    @Override
    public double calculate(double amount) {
        double totalLoan = amount*loanAmount;
        System.out.println("Residence Insurance Total Loan: " + totalLoan);
        return totalLoan;
    }
}
