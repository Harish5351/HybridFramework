package com.example.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    Properties pro;
     public ReadConfig(){
        File file = new File("Configuration/config.properties");
        try {
            FileInputStream fis = new FileInputStream(file);
            pro = new Properties();
            pro.load(fis);
        } catch (Exception e) {
            System.out.println("Exception is: " +e.getMessage());
        }
     }

     public String getLoginBaseURL() {
        String loginURL = pro.getProperty("LoginBaseURL");
        return loginURL;
     }

     public String getGoogleBaseURL() {
        String googleURL = pro.getProperty("GoogleBaseURL");
        return googleURL;
     }

     public String getUsername() {
        String uname = pro.getProperty("uname");
        return uname;
     }

     public String getPassword() {
        String upwd = pro.getProperty("upwd");
        return upwd;
     }

     public String getSuccessURL() {
        String successUrl = pro.getProperty("SuccessURL");
        return successUrl;
     }
}
