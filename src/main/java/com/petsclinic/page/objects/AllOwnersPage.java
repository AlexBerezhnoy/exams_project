package com.petsclinic.page.objects;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AllOwnersPage extends BasePage{

    private By ownersTab = By.cssSelector("h2");
    private By newOwnerRow = By.cssSelector("table.table.table-striped tr:last-child a");
    private By addOwnersBtn = By.cssSelector("button.btn.btn-default");

    public AllOwnersPage isOwnersPage () {
        $(ownersTab).shouldHave(Condition.exactText("Owners"));
        return this;
    }

    public AddOwnersPage addOwner() {
        $(addOwnersBtn).click();
        return new AddOwnersPage();
    }

    public AllOwnersPage userIsAdded (String newOwnerFirstName, String newOwnerLastName) {
        $(newOwnerRow).shouldHave(Condition.exactText(newOwnerFirstName + " "+ newOwnerLastName));
        return this;
    }
}
