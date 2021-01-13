package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class TestCreateGroup extends TestBase {

    @Test
    public void testCreateGroupMethod() throws Exception {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test1", "test1", "test1"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
