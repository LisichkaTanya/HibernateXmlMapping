package entity;

import java.sql.Date;
import java.util.Objects;

public class Employee {

    private long id;
    private String firstName;
    private String lastName;
    private Date birthday;
    private long addressID;

    public Employee() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public java.sql.Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public long getAddressID() {
        return addressID;
    }

    public void setAddressID(long addressID) {
        this.addressID = addressID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(birthday, employee.birthday) &&
                Objects.equals(addressID, employee.addressID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, birthday, addressID);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", addressID=" + addressID +
                '}';
    }

}
