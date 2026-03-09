package Ex3;

public class Order {
    private Customer customer;
    private int id;

    public Order(Customer customer,int id) {
        this.customer = customer;
        this.id=id;
    }


    public String printShippingLabel() {
        String city = customer.getAddressCity();
        customer.setAddressCity(city.trim().toUpperCase());
        return "Shipping to: " + city;
    }

    public String getCustomer() {
        return customer.getName();
    }
}
