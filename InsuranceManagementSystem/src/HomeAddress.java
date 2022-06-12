import java.util.TreeSet;

public class HomeAddress implements Address{
    private int id;
    private String town;
    private String country;
    private String houseAddress;


    public HomeAddress(String town, String country, String houseAddress) {
        this.houseAddress = houseAddress;
        this.id = countId();
        this.town = town;
        this.country = country;
    }
    public int countId(){
        int id =0;
        id += 2;
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        if (this.getClass().getName().equals("HomeAddress")) {
            HomeAddress homeAddress = (HomeAddress) obj;
            return (homeAddress.getId() != this.getId());
        }
        return true;
    }

    public String getTown() {
        return town;
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

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public void showAddressInfo() {
        System.out.println("House Address: " + this.getId() + " " + this.getCountry() + " " +
                this.getTown() + " " + this.getHouseAddress() );
    }

    @Override
    public int hashCode()
    {
        return this.id;
    }
}
