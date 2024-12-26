public class  PersonAddressTest{
    public static void main(String[] args) {
        PersonAddress person1 = new PersonAddress("MUDRIK","IDDI", "mudrik@gmail.com", "0776112552");
        PersonAddress person2 = new PersonAddress("MOHD","HAMAD", "mohd@gmail.com", "0777436806");
        PersonAddress person3 = new PersonAddress("SALMA","JUMA", "salma@gmail.com", "0777189245");
        PersonAddress person4 = new PersonAddress("mudrik","iddi", "salma@gmail.com", "0777189245");
        System.out.println(person1.equal(person4));
        person2.settelephone("0768860957");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        System.out.println(person4.toString());

    }
}