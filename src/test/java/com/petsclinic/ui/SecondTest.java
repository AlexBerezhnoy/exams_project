package com.petsclinic.ui;


import com.petsclinic.page.objects.AddOwnersPage;
import com.petsclinic.page.objects.AllOwnersPage;
import com.petsclinic.page.objects.TopBar;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.ArrayList;


public class SecondTest extends TestBase{
    private TopBar topBar = new TopBar();
    private AllOwnersPage allOwnersPage = new AllOwnersPage();
    private AddOwnersPage addOwnersPage = new AddOwnersPage();

    private String firstName = "Alex121122";
    private String lastName = "Cool";
    private String address = "Saint maria str.";
    private String city = "NY";
    private String telephone = "58621555";
    private int id = 0;
    private ArrayList pets = null;

    @Test
    public void addNewOwnersTest() {

            RestAssured
                    .given()
                    .accept(ContentType.JSON)
                    .contentType(ContentType.JSON)
                    .body("{\n"+
                            "\"address\": \""+address+"\",\n"+
                            "\"city\": \""+city+"\",\n"+
                            "\"firstName\": \""+firstName+"\",\n"+
                            "\"lastName\": \""+lastName+"\",\n"+
                            "\"telephone\": \"" + telephone+ "\",\n"+
                            "\"id\":"+id+","+
                            "\"pets\":"+pets
                            +"}")
                    .when()
                    .post("http://46.101.230.213:9966/petclinic/api/owners")
                    .then()
                    .statusCode(201).log().all();
       }
}
