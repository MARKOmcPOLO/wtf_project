package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactPhoneTest extends TestBase{

    @Test
    public void contactPhoneTestMethod(){
        app.goTo().homePage();
//        ContactData contact = app.contact().all().iterator().next();
    }
}
