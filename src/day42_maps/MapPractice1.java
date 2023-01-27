package day42_maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        System.out.println("---------------------------------------------");

        int countFemale = 0;
        int countMale = 0;

        for (String eachValue : employeeMap.values()) {
            if(eachValue.equals("F")){
                countFemale++;
            }else{
                countMale++;
            }
        }
        System.out.println("countMale = " + countMale);
        System.out.println("countFemale = " + countFemale);

        System.out.println("---------------------------------------------");
        // display the names of all the female employees


        for (String eachKey : employeeMap.keySet()) {
            String gender = employeeMap.get(eachKey);
            if(gender.equals("F")){
                System.out.println(eachKey);
            }
        }

        for (Map.Entry<String, String> each : employeeMap.entrySet()) {
            if(each.getValue().equals("F")) {
                System.out.println(each.getKey());
            }
        }

        System.out.println("---------------------------------------------");
        // update all the "M" values with "Male", "F" values with "Female"

        for (Map.Entry<String, String> each : employeeMap.entrySet()) {
            if(each.getValue().equals("F")){
                each.setValue("Female");
            }else{
                each.setValue("Male");
            }
            System.out.println(each);


        }
        System.out.println(employeeMap);
    }
}
