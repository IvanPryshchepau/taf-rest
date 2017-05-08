package by.bsuir.fcd.taf.helpers;


import by.bsuir.fcd.taf.constants.RestServicesURI;

import java.util.Map;

public class CourseServiceHelper {

    private String userId;
    private String unitId;
    private Map<String, Integer> userAnswers;

    public String getUserCoursesURI(){
        return RestServicesURI.COURSE_SERVICE_URI + "/" + userId;
    }

    public String getUserCourseUnit(){
        return RestServicesURI.COURSE_SERVICE_URI + "/" + userId + "/units/" + unitId;
    }

    public String getUserCourseUnitTest(){
        return RestServicesURI.COURSE_SERVICE_URI + "/" + userId + "/units/" + unitId + "/test";
    }

}
