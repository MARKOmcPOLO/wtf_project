package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactAddTest extends TestBase{

    @Test (enabled = false)
    public void contactAddTestMethod(){
        app.goTo().gotoContactPage();
        app.getContactHelper().fillContactForm(new ContactData("UserFirstName", "UserMiddleName", "UserLastName", "test1"), true);
        app.getContactHelper().submitContactAdd();
        app.getContactHelper().returnToHomePage();
    }
}
