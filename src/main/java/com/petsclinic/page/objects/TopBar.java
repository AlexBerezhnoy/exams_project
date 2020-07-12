package com.petsclinic.page.objects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TopBar extends BasePage{
    private By ownersBtn = By.cssSelector("a.dropdown-toggle");
    private By allOwnersBtn = By.cssSelector("ul.dropdown-menu > li:nth-child(1) > a");

    public AllOwnersPage clickAllOwnersButton () {
        $(ownersBtn).click();
        $(allOwnersBtn).click();
        return new AllOwnersPage();
    }
}
