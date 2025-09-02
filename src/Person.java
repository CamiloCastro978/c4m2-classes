
public class Person {

    //Atributos
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    //Constructors
    public Person() {
        this("John", "Doe", "John.Doe@gmail.com", "5555111122220");

    }

    public Person(String firstName, String lastName) {
        this(firstName, lastName, "John.Doe@gmail.com", "5555111122220");

    }

    public Person(String firstName, String lastName, String email) {
        this(firstName, lastName, email, "5555111122220");
    }

    public Person(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //Seters
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("Person: fullName=%s, emal=%s, phone=%s", firstName, lastName, email, phoneNumber);
    }

}
