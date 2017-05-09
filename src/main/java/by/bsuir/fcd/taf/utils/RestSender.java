package by.bsuir.fcd.taf.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestSender {

    public static Response get(String uri){
        return RestAssured.when().get(uri);
    }

    public static Response post(String uri, RequestSpecification rq){
        return RestAssured.given(rq).when().post(uri);
    }

    public static Response put(String uri, RequestSpecification rq){
        return RestAssured.given(rq).when().put(uri);
    }

}
