package Weather;


import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    String city;

    String weather;

    HashMap<String, Integer> cities = new HashMap();

    Path source = Paths.get("cities.csv");

    try {
      BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(source)));
      String line = reader.readLine();
      while (line != null) {
        city = line.split(",")[1];
        weather = line.split(",")[2];
        if (weather.equals("RAINY")) {
          if (cities.containsKey(city)) {
            cities.replace(city, cities.get(city) + 1);
          } else {
            cities.put(city, 1);
          }
        }
        line = reader.readLine();
      }       // Collections class static method not instantiated(makes a collection out of the HashMap) makes comparing
      String key = Collections.max(cities.entrySet(), Map.Entry.comparingByValue()).getKey();
      System.out.println(key);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
