public class Customer extends Person{
    private int customerNumber;
    private boolean mailing;
    public Customer(String name,Address address,String telephone,int customerNumber,boolean mailing){
        super(name,address,telephone);
        this.customerNumber = customerNumber;
        this.mailing = mailing;
    }
    public int getCustomerNumber(){
        return customerNumber;
    }
    public boolean getMailing(){
        return mailing;
    }
    public String toString(){
        return super.toString()+"\nCustomer number is "+getCustomerNumber()+"\nMailling "+getMailing();

    }
}
