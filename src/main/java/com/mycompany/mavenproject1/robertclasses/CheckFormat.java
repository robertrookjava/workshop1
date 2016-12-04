/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.robertclasses;
import java.math.BigDecimal;

/**
 *
 * @author robertrook
 */
public class CheckFormat {
    
    
    // format chacks methods
    
    public static boolean isInteger (String str) {
        try {
            Integer.parseInt(str);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }
    
    public static boolean isBigDecimal (String str) {
        try {
            BigDecimal bigdecimal = new BigDecimal (str);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }
    
    
}
