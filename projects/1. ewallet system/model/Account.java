package model;

public class Account {
    private String userName;
    private String password;
    private Float age ;
    private String phoneNumber;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userNameArg) {
        this.userName = userNameArg;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passwordArg) {
        this.password = passwordArg;
    }

    public Float getAge() {
        return age;
    }

    public void setAge(Float ageArg) {
        this.age = ageArg;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumberArg) {
        this.phoneNumber = phoneNumberArg;
    }
}
