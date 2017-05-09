package by.bsuir.fcd.taf.helpers;

import by.bsuir.fcd.taf.constants.RestServicesURI;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class UserServiceHelper extends BaseHelper{

    private String userId;
    private String courseId;
    private String unitId;
    private String email;
    private String password;
    private String name;
    private String lastName;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserURI(){
        return RestServicesURI.USER_SERVICE_URI + "/" + userId;
    }

    public String getUserCourses(){
        return getUserURI() + "/courses";
    }

    public String getUserCourseUnits(){
        return getUserCourses() + "/" + courseId +"/units";
    }

    public String getUserCourseUnitTest(){
        return getUserCourseUnits() + unitId;
    }

    public RequestSpecification getSignUpRequest(){
        return RestAssured.given().params("name", name,
                "lastName", lastName,
                "email", email,
                "password", password);
    }

    public RequestSpecification getLoginRequest(){
        return RestAssured.given().params("email", email,
                "password", password);
    }

}
