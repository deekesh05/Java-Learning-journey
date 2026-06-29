import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapQuestion {
    public static void main(String[] args) {
        HashMap<String, String> country = new HashMap<>();
        country.put("india" , "New Delhi");
        country.put("nepal" , "Kathmandu");
        country.put("america" , "Washington DC");
        country.put("russia" , "Moscow");
        country.put("china" , "Beijing");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Country Name : ");
        String name = input.nextLine().toLowerCase();
        if(country.containsKey(name))
        {
            System.out.print("Capital is " + country.get(name));
        }
        else {
            System.out.println("Country not found ");
        }

    }
}
