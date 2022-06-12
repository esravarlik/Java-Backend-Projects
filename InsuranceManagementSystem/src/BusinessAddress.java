public class BusinessAddress implements Address{
    private int id;
    private String town;
    private String country;
    private String workAddress;

    public BusinessAddress( String town, String country, String workAddress) {
        this.id = countId();
        this.workAddress = workAddress;
        this.town = town;
        this.country = country;
    }

    public int countId(){
        int id = 1;
        id += 2;
        return id;
    }
    @Override
    public void showAddressInfo() {
        System.out.println("Business Address: " + this.getId() + " " + this.getCountry() + " " +
                this.getTown() + " " + this.getWorkAddress() );
    }

    @Override
    public int hashCode()
    {
        return this.id;
    }

    public String getTown() {
        return town;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }

        if(this.getClass().getName().equals("BusinessAddress")){
            BusinessAddress businessAddress = (BusinessAddress) obj;
            return (businessAddress.getId() != this.getId());
        }

        return true;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
