package by.bsuir.fcd.taf.common;


import java.util.HashMap;
import java.util.Map;

public class InfoMapper {

    private Map<String, String> map;
    private static InfoMapper infoMapper;

    private InfoMapper() {
        map = new HashMap<>();
    }

    public static InfoMapper getInstance(){
        if (infoMapper == null){
            infoMapper = new InfoMapper();
        }
        return infoMapper;
    }

    public Map<String, String> getMap() {
        return infoMapper.map;
    }
}
