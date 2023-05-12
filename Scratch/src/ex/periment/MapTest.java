package ex.periment;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class MapTest {

    public static void main(String[] args) {
        Map<String,Double> gpaMap = new HashMap<>();  // K: String, V: Double

        gpaMap.put("jay", 3.85);
        gpaMap.put("eric", 3.9);
        gpaMap.put("exxon", 2.0);
        gpaMap.put("jason", 3.4);
        gpaMap.put("raylan", 2.6);
        gpaMap.put("michael", 3.7);
        dump(gpaMap);
        System.out.println();

        // print all gpas that are 3.5 or greater
        Collection<Double> gpas = gpaMap.values();    // Collection<Double> here
        for (double gpa : gpas) {
            if (gpa >= 3.5) {
                System.out.println(gpa);
            }
        }
        System.out.println();

        // print all names of those with a gpa of 3.0 or greater
        for (var entry : gpaMap.entrySet()) {
            if (entry.getValue() >= 3.0) {
                System.out.println(entry.getKey());
            }
        }
    }

    private static void dump(Map<String,Double> map) {
        for (Map.Entry<String,Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " | " + entry.getValue());
        }
    }
}