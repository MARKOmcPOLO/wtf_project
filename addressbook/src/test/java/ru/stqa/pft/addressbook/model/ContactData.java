package ru.stqa.pft.addressbook.model;

public class ContactData {

    private String firstName;
    private String middleName;
    private String lastName;

    private String group;

    public ContactData(String firstName, String middleName, String lastName, String group){

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }
}
