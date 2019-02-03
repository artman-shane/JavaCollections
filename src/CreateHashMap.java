import java.util.HashMap;
import java.util.Map;

public class CreateHashMap {

    public static void generateHashMap () {
        Map<String, String> osList = new HashMap<>();
        System.out.println("\n\n\nBeginning of HashMap Section");

        osList.put("OSName", "MacOS");
        osList.put("Version", "10.14");
        osList.put("BuildName", "Mojave");
        osList.put("Manufacture", "Apple");

        System.out.println("Printing HashMap: " + osList);

        System.out.println("The version is: " + osList.get("Version"));
        System.out.println("The manufacture is " + osList.get("Manufacture"));

        System.out.println("End of HashMap Section");


    }
}
