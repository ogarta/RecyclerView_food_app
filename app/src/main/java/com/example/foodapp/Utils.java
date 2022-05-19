package com.example.foodapp;

import java.util.Date;

public class Utils {

    public static int createDateForHour(int hour){
        Date date = new Date();
        date.setTime(hour);
        return date.getHours();
    }
}
