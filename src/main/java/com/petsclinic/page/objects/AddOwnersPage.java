package com.petsclinic.page.objects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddOwnersPage {
    private By newOwnerTab = By.cssSelector("h2");
    private By firstNameField = By.name("firstName");
    private By lastNameField = By.name("lastName");
    private By addressField = By.name("address");
    private By cityField = By.name("city");
    private By telephoneField = By.name("telephone");
    private By addOwnerBtn = By.cssSelector("button[type='submit']");

    public AddOwnersPage isAddOwnersPage () {
        $(newOwnerTab).shouldHave(Condition.exactText("New Owner"));
        return this;
    }

    public void inputFirstName(String firstName) {
        $(firstNameField).setValue(firstName);
    }

    public void inputLastName(String lastName) {
        $(lastNameField).setValue(lastName);
    }

    public void inputAddress(String address) {
        $(addressField).setValue(address);
    }

    public void inputCity(String city) {
        $(cityField).setValue(city);
    }

    public void inputTelephone(String telephone) {
        $(telephoneField).setValue(telephone);
    }

    public AllOwnersPage addOwner() {
        $(addOwnerBtn).click();
        return new AllOwnersPage();
    }
}
