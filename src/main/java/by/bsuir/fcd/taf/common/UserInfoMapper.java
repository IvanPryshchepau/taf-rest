package by.bsuir.fcd.taf.common;


import java.util.HashMap;
import java.util.Map;

public class UserInfoMapper {

    private Map<String, String> map;
    private UserInfoMapper userInfoMapper;

    private UserInfoMapper() {
        map = new HashMap<>();
    }

    public UserInfoMapper getInstance(){
        if (userInfoMapper == null){
            userInfoMapper = new UserInfoMapper();
        }
        return userInfoMapper;
    }

    public Map<String, String> getMap() {
        return userInfoMapper.map;
    }
}
