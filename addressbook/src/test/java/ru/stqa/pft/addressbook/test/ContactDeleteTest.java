package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;

public class ContactDeleteTest extends TestBase{

    @Test (enabled = false)
    public void contactDeleteTestMethod(){
        app.goTo().homePage();
        app.contact().selectContact();
        app.contact().deleteSelectedContact();
        app.contact().accept();
    }
}
