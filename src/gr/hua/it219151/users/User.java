package gr.hua.it219151.users;

import gr.hua.it219151.enums.UserType;

public class User extends Person{
    private String firstName;
    private String lastName;
    private String AFM;
    private String Address;
    private String ID;
    private UserType userType;
    private String email;
    private String password;
    private int discount;

    public User(String firstName, String lastName, String AFM, String address, String ID, UserType userType, String email, String password, int discount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.AFM = AFM;
        this.Address = address;
        this.ID = ID;
        this.userType = userType;
        this.email = email;
        this.password = password;
        this.discount = discount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAFM() {
        return AFM;
    }

    public void setAFM(String AFM) {
        this.AFM = AFM;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
