package com.petsclinic.page.objects;

import com.codeborne.selenide.Configuration;

public class BasePage {

    static {
        Configuration.baseUrl = "http://46.101.230.213:8000/";
    }
}
