package by.bsuir.fcd.taf.helpers;


import by.bsuir.fcd.taf.constants.RestServicesURI;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class CourseServiceHelper extends BaseHelper{

    private String courseId;
    private String unitId;
    private Map<String, Integer> userAnswers;

    public String getCourseURI(){
        return RestServicesURI.COURSE_SERVICE_URI + "/" + courseId;
    }

    public String getCourseUnit(){
        return getCourseURI() + "/units/" + unitId;
    }

    public String getCourseUnitTest(){
        return getCourseUnit() + "/test";
    }

    public RequestSpecification getTestsRequest(){
        return RestAssured.given();//TBD
    }

}
