import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class AddressManager {
    private static Scanner sc = new Scanner(System.in);
     private static ArrayList<Address> addressList = new ArrayList<>();
    public static void addAddress(User user){
        System.out.println("Add Address");
        System.out.print("1 Home Address \n" +
                "2 Business Address \n" +
                "Choose address id: ");

        int addressChoice = sc.nextInt();
        System.out.println("Enter city: ");
        String city = sc.next();
        System.out.println("Enter country: ");
        String country = sc.next();
        switch (addressChoice){
            case 1:
                System.out.println("Home Address: ");
                String houseAddress = sc.next();
                addressList.add(new HomeAddress(city, country, houseAddress));
                break;
            case 2:
                System.out.println("Work Address: ");
                String workAddress = sc.next();
                addressList.add(new BusinessAddress(city,country,workAddress));
                break;
            default:
                user.setAddressList(addressList);
        }
    }

    public static void deleteAddress(User user, int id){
        user.getAddressList().remove(id - 1);
        System.out.println("Address deleted.");
    }

}
