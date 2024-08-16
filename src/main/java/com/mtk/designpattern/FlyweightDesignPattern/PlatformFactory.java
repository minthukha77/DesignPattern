package com.mtk.designpattern.FlyweightDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class PlatformFactory {
    private static Map<String,Platform> map = new HashMap<>();
    
    public static Platform getInstance(String platformType)
    {
        Platform p = map.get(platformType);
        if(p == null)
        {
            switch(platformType)
            {
                case ".NET":
                    p = new DotNetPlatForm();
                break;
                case "JAVA":
                    p = new JavaPlatform();
                break;
            }
            map.put(platformType, p);
            
        }
        return p;
    }
}
