package by.bsuir.fcd.taf.helpers;


import by.bsuir.fcd.taf.constants.RestServicesURI;

public class UserServiceHelper extends BaseHelper{

    private String userId;
    private String courseId;
    private String unitId;

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

}
