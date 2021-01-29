package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModifyTest extends TestBase {

    @Test (enabled = false)
    public void contactModifyTestMethod(){
        app.goTo().gotoHomePage();
        app.getContactHelper().modifyContact();
        app.getContactHelper().fillContactForm(new ContactData("Max", "Marchenko", "Sergeevich", null), false);
        app.getContactHelper().submitContactModify();
        app.getContactHelper().returnToHomePage();
    }
}
