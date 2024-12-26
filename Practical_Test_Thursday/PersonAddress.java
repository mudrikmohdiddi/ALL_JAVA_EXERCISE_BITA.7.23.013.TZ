public class PersonAddress {
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    public PersonAddress(String firstName,String lastName,String email,String telephone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.telephone = telephone;
    }
    public String getfirstName(){
        return firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public String getemail(){
        return email;
    }
    public String gettelephone(){
        return telephone;
    }
    public void setemail(String email){
        this.email = email;
    }
    public void settelephone(String telephone){
        this.telephone = telephone;
    }
    public boolean equal(PersonAddress other){
        return this.firstName.equalsIgnoreCase(other.firstName) && this.lastName.equalsIgnoreCase(other.lastName);
    }
    public String toString(){
    return String.format("\nThe first name is %s\nThe last name is %s\nThe email address is %s\nThe telephone number is %s",getfirstName(),getlastName(),getemail(),gettelephone());
    
    }

}
