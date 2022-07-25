/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi7_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author anhkon
 */
public class DemoMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        
        map.put("Iphone x", 7);
        map.put("Iphone 11", 15);
        map.put("Iphone 12", 20);
        map.put("Iphone 13", 25);
        System.out.println(map);
        
        Set<String> keys = map.keySet();
        for (String key : keys) {
            
            Integer value = map.get(key);
            System.out.println( key + ": "+ value);
        
        }
    }
}
