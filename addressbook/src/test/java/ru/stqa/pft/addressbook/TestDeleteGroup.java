package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class TestDeleteGroup extends TestBase {

    @Test
    public void testDeleteGroupMethod() throws Exception {
        gotoGroupPage();
        selectGroup();
        deleteSelectedGroup();
        returnToGroupPage();
    }

}
