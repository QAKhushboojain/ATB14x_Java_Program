package ex_030_Collection_Framework.CF_04_MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab249_Real_Example {
    public static void main(String[] args) {
        // storing environment - specific configuration
        Map<String, String> envConfig = new HashMap<>();
        envConfig.put("production", "https://prod.api.com");
        envConfig.put("stagging", "https://stagging.api.com");
        // Managing user credentials
        Map<String, String> credentials = new HashMap<>();
        credentials.put("admin", "admin123");
        credentials.put("user", "user123");
        credentials.put("user", "null");
        credentials.put("user1", "null");
        Map <String, String> map = new HashMap(10);
        // initial Capacity  - > 10
        // 20 * Load * new value -> HashMap size will increase


    }
}
