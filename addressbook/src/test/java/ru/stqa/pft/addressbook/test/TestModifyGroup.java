package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class TestModifyGroup extends TestBase {

    @Test
    public void testModifyGroupMethod(){
        app.getNavigationHelper().gotoGroupPage();
        if(! app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("test1", "test1", "test1"));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModify();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test1", "test1"));
        app.getGroupHelper().submitGroupModify();
        app.getGroupHelper().returnToGroupPage();
    }
}
