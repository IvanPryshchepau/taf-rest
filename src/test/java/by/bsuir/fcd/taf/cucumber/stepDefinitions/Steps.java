package by.bsuir.fcd.taf.cucumber.stepDefinitions;

import cucumber.api.java.en.Given;
import org.json.JSONArray;

import static io.restassured.RestAssured.get;

public class Steps {

    @Given("")
    public void start(){
        JSONArray resp = new JSONArray(get("").asString());

    }

}
