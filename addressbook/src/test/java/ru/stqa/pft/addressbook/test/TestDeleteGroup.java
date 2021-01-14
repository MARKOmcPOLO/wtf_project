package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;

public class TestDeleteGroup extends TestBase {

    @Test
    public void testDeleteGroupMethod() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroup();
        app.getGroupHelper().returnToGroupPage();
    }

}
