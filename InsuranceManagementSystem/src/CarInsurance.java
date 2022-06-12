import java.util.Date;

public class CarInsurance extends Insurance{
    public double loanAmount = 1.12;

    public CarInsurance(double insuranceFee, Date startDate, Date finishDate) {
        super("Car Insurance", startDate, finishDate);
        this.setInsuranceFee(calculate(insuranceFee));
    }

    @Override
    public double calculate(double amount) {
        double totalLoan = amount*loanAmount;
        System.out.println("Car Insurance Total Loan: " + totalLoan);
        return totalLoan;
    }
}
