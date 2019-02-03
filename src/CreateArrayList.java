import java.util.ArrayList;

public class CreateArrayList {

    public static void generateArrayList() {
        ArrayList<String> osList = new ArrayList<>();

        // populate arraylist with data
        osList.add("RHEL Linux");
        osList.add("Microsoft Windows");
        osList.add("ChromeOS");
        osList.add("MacOS");

        System.out.println("\n\n\nBeginning ArrayList output");
        for (String list : osList) {
            System.out.println("List Item: " + list);
        }
        System.out.println("End of ArrayList output");

    }
}
