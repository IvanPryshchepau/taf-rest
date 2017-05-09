package by.bsuir.fcd.taf.helpers;


import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class NotificationServiceHelper extends BaseHelper{

    private String sendToEmail;
    private String sendTime;

    public void setSendToEmail(String sendToEmail) {
        this.sendToEmail = sendToEmail;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public RequestSpecification getLoginRequest(){
        return RestAssured.given().params("sendToEmail", sendToEmail,
                "password", sendTime);
    }

}
