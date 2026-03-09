package Ex3;

public class Customer {
    private Address address;
    private String name;

    public Customer(Address address,String name) {
        this.address = address;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public String getAddressCity(){
        return address.getCity();
    }

    public void setAddressCity(String  city){
        address.setCity(city);
    }
}
