/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Alex
 */
public class WelcomeService {
    private Calendar cal = Calendar.getInstance();
    int hour = cal.get(Calendar.HOUR_OF_DAY);
 
     public String getTimeofDay(){
       if(hour<12){
            return " Morning";
       } else  if(hour>=12 && hour<=18){
            return " Afternoon";
       } else{
            return " Evening";
       }
    }
     
    public String getGreeting(String name){
    
        return "Good" + getTimeofDay()+ "," + name +". Welcome!";
    } 
}
