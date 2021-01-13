package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;

public class TestDeleteGroup extends TestBase {

    @Test
    public void testDeleteGroupMethod() throws Exception {
        app.gotoGroupPage();
        app.selectGroup();
        app.deleteSelectedGroup();
        app.returnToGroupPage();
    }

}
