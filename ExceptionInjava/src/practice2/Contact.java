package practice2;

public class Contact implements Comparable<Contact> {

    private String firstName, lastName, address, phone;
    private int age;
    private int id;
    static int addid = 1;

    public Contact(String firstName, String lastName, String address,
            String phone, int age) throws InvalidInputException{
        this.setAge(age);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAddress(address);
       this.setPhone(phone);
        
        this.id = addid++;
    }

    public String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName)
            throws InvalidInputException {
        if (!firstName.isEmpty() && firstName.length() <= 8) {
            this.firstName = firstName;
        } else {
            throw new InvalidInputException();
        }
    }

    public String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName)
            throws InvalidInputException {
        if (!lastName.isEmpty() && lastName.length() <= 8) {
            this.lastName = lastName;
        } else {
            throw new InvalidInputException();
        }

    }

    public String getAddress() {
        return address;
    }

    public final void setAddress(String address)
            throws InvalidInputException {
        if (!(address.trim().isEmpty())) {
            this.address = address;
        } else {
            throw new InvalidInputException();
        }
    }

    public String getPhone() {
        return phone;
    }

    public final void setPhone(String phone)
            throws InvalidInputException {
        if (phone.length() == 13) {
            this.phone = phone;
        } else {
            throw new InvalidInputException();
        }
    }
    
    
    
 
    public int getAge() {
        return age;
    }

   public final void setAge(int age)
            throws InvalidInputException {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            throw new InvalidInputException();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Contact o) {
        int diff = this.firstName.compareTo(o.firstName);
        if (diff != 0) {
            return diff;
        }
        return this.lastName.compareTo(o.lastName);
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + " firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", phone=" + phone + ", age=" + age + '}';
    }

}
