package ru.stqa.pft.addressbook.test;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

public class TestCreateGroup extends TestBase {

    @Test
    public void testCreateGroupMethod() throws Exception {
        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("test1", "test1", "test1"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
