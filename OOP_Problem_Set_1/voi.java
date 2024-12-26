class PersonAddress {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public PersonAddress(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean equals(PersonAddress other) {
        return this.firstName.equalsIgnoreCase(other.firstName) &&
               this.lastName.equalsIgnoreCase(other.lastName);
    }
}

