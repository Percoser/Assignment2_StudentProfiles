public class AddressClass extends Student{
    public String number;
    public String street;
    public String streetType;
    public String city;
    public String state;
    public String zip;

    public static String getAddress(String number, String street, String streetType, String city, String state, String zip) {
        number = number;
        street = street;
        streetType = streetType;
        city = city;
        state = state;
        zip = zip;
        return number + " " + street + "" + streetType +"\n" + city + "," + " " + state + "\n" + zip;
    }

}
