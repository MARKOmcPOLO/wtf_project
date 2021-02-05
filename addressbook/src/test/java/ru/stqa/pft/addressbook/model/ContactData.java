package ru.stqa.pft.addressbook.model;

import java.io.File;

public class ContactData {

    private String firstName;
    private String middleName;
    private String lastName;
    private String group;
    private File photo;

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }

    public ContactData(String firstName, String middleName, String lastName, String group, File photo){

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.group = group;
        this.photo = photo;
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
