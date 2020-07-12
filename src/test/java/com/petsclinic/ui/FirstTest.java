package com.petsclinic.ui;

import com.petsclinic.page.objects.AddOwnersPage;
import com.petsclinic.page.objects.AllOwnersPage;
import com.petsclinic.page.objects.TopBar;
import org.testng.annotations.Test;

public class FirstTest extends TestBase{

    private TopBar topBar = new TopBar();
    private AllOwnersPage allOwnersPage = new AllOwnersPage();
    private AddOwnersPage addOwnersPage = new AddOwnersPage();
    private String firstName = "Alex123112";
    private String lastName = "Cool";
    private String address = "Saint maria str.";
    private String city = "NY";
    private String telephone = "58621555";

    @Test

    public void firstTest() {
        topBar.clickAllOwnersButton().isOwnersPage();
        allOwnersPage.addOwner();
        addOwnersPage.isAddOwnersPage();
        addOwnersPage.inputFirstName(firstName);
        addOwnersPage.inputLastName(lastName);
        addOwnersPage.inputAddress(address);
        addOwnersPage.inputCity(city);
        addOwnersPage.inputTelephone(telephone);
        addOwnersPage.addOwner();
        allOwnersPage.userIsAdded(firstName, lastName);
        System.out.println();
    }
}
