package com.testing;

import java.util.regex.Pattern;

public class MoodAnalyzer {

    public String checkSad(String string) {
        if(string.contains("sad")){
            return "SAD";
        }else{
            return "HAPPY";
        }
    }

    public boolean checkName(String name) {
        boolean value = Pattern.matches("^[A-Z][a-zA-Z]{3,}$", name);
        return value;
    }

    public boolean checkMobileFormat(String mobileNumber) {
        boolean value = Pattern.matches("^(91)\\s?[6-9][0-9]{9}$", mobileNumber);
        return value;
    }

    public boolean checkPassword(String password) {
        boolean value = Pattern.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@$!%*#?&])[A-Za-z\\d$@$!%*#?&]{8,}$", password);
        return value;
    }
}
