package Ex_27_Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab_250_Real_Example {
    public static void main(String[] args) {

        //Storing environment - specific configuration
        Map<String,String> envConfig = new HashMap<>();
        envConfig.put("production","https://prod.api.com");
        envConfig.put("staging","https://stage.api.com");

        //Managing User Credentials
        Map<String,String> credentials = new HashMap<>();
        credentials.put("admin","admin@123");
        credentials.put("user","user@123");

        //Sending data from the Map to json, Json to Map -> In API automation

        //Web Selenium = Store the web Elements with Keys
    }
}
