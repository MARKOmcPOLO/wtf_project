package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.io.File;

public class ContactAddTest extends TestBase {

    @Test
    public void contactAddTestMethod() {
        app.goTo().gotoContactPage();
        File photo = new File("src/test/resources/stru.png");
        app.contact().fillContactForm(new ContactData(
                "UserFirstName",
                "UserMiddleName",
                "UserLastName",
                "test1").withPhoto(photo), true);
        app.contact().submitContactAdd();
        app.contact().returnToHomePage();
    }
}
