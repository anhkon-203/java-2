/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author anhkon
 */
public class DateUtil {
        public static Date toDate(String s) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("dd-mm-yyyy");
        Date d = null;
        try {
            d = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
            throw e;
        }

        return d;
    }

    public static String toString(Date d) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("dd-mm-yyyy");
        return  sdf.format(d);
    }
}
