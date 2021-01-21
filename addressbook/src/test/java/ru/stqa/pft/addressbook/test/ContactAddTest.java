package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactAddTest extends TestBase{

    @Test
    public void testAddContactMethod(){
        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().fillContactForm(new ContactData("Ivan", "Ivanov", "Ivanovich"));
        app.getContactHelper().submitContactAdd();
        app.getContactHelper().returnToHomePage();
    }
}
