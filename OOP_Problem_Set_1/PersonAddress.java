public class PersonAddress {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public PersonAddress(String f, String l, String e, String p) {
        this.firstName = f;
        this.lastName = l;
        this.email = e;
        this.phoneNumber = p;
    }
    public void changeEmail(String e){
        this.email = e;
    }
    public void changePhoneNumber(String p){
        this.phoneNumber = p;
    }

    public boolean equals(PersonAddress other) {
        return this.firstName.equalsIgnoreCase(other.firstName) &&
               this.lastName.equalsIgnoreCase(other.lastName);
    }
    public void displays(int personNumber){
        System.out.printf("Person %d\nFirst name:%s\nLast name:%s\nEmail:%s\nPhone number:%s\n",personNumber,
        firstName,
        lastName,email,phoneNumber);
    }
        
    
    public static void main(String[] args) {
        PersonAddress person1 = new PersonAddress("Mudrik", "Iddi", "mudrik@gmail.com", "0776112552");
        PersonAddress person2 = new PersonAddress("MUDRIK", "IDDI", "mudrik@gmail.com", "077189245");
        person1.displays(1);
        person2.displays(2);

        person2.changeEmail("mohd");
        person1.changePhoneNumber("0645327678");
        System.out.println("After change phone number and email");
        person1.displays(1);
        person2.displays(2);

        if(person1.equals(person2)==true){
        System.out.println("Person 1 and person 2 are Same person");
    }
     else {
        System.out.println( "Person 1 and person 2 are Different persons");
    }

    }

}
