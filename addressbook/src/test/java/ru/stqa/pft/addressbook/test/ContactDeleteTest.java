package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;

public class ContactDeleteTest extends TestBase{

    @Test (enabled = false)
    public void contactDeleteTestMethod(){
        app.goTo().gotoHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
        app.getContactHelper().accept();
    }
}
