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
                "test1",
                photo), true);
        app.contact().submitContactAdd();
        app.contact().returnToHomePage();
    }

//    @Test
//    public void currentDir() {
//        File currentDir = new File(".");
//        System.out.println(currentDir.getAbsolutePath());
//        File photo = new File("src/test/resources/stru.png");
//        System.out.println(photo.getAbsolutePath());
//        System.out.println(photo.exists());
//    }
}
