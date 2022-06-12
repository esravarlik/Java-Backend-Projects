import java.util.Date;

public abstract class Insurance {
    private String insuranceName;
    private double insuranceFee;
    private Date startDate;
    private Date finishDate;

    public Insurance(String insuranceName, Date startDate, Date finishDate) {
        this.insuranceName = insuranceName;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    public abstract double calculate(double amount);

    public double getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }
}
