package s210316033;
public class Order {
    private String orderName;
    private String orderAddress;
    private String creditCard;
    private String customer;
    private String customerSurname;
    
    public Order(String customer,String customerSurname,
            String orderName,  String creditCard, String orderAddress
            ){
    this.orderName = orderName;
    this.customer = customer;
    this.creditCard = creditCard;
    this.orderAddress = orderAddress;
    this.customerSurname = customerSurname;
    }
    public static String showOrder(Order or){
    return String.format("Customer: %s %s%nProsecute: %s%nCredit Card: "
            + "%s%nAddress: %s%n", or.customer,or.customerSurname,or.orderName,
            or.creditCard,or.orderAddress);
    }
}
