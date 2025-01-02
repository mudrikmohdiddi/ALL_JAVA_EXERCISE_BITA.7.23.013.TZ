public class CustomerTest {
    public static void main(String[] args) {
        Address address = new Address("CHWAKA", "Zanzibar", "Tanzania");
        Customer customer1 = new Customer("MUDRIK MOHD", address, "0776112552", 5, true);
        System.out.println(customer1.toString());
    }
    
}
