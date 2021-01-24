package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;

public class ContactDeleteTest extends TestBase{

    @Test
    public void contactDeleteTestMethod(){
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
        app.getContactHelper().accept();
    }
}
