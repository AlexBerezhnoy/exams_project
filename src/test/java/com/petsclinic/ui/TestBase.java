package com.petsclinic.ui;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    static {
        Configuration.baseUrl = "http://46.101.230.213:8000/";
    }

    @BeforeMethod
    public void setUp() {
        open(Configuration.baseUrl);
    }
}
