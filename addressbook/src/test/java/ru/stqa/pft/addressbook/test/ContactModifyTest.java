package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModifyTest extends TestBase {

    @Test (enabled = false)
    public void contactModifyTestMethod(){
        app.goTo().homePage();
        app.contact().modifyContact();
        app.contact().fillContactForm(new ContactData()
                .withFirstName("UserFirstName").withMiddleName("UserMiddleName")
                .withLastName("UserLastName").withGroup("test1"),false);
        app.contact().submitContactModify();
        app.contact().returnToHomePage();
    }
}
