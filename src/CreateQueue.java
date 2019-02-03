import java.util.LinkedList;
import java.util.Queue;

public class CreateQueue {

    public static void generateQueue() {

        System.out.println("Beginning Queue Section");
        Queue<String> queue = new LinkedList<>();
        String[] queueMembers = {"Shane", "John", "Samantha", "Matthes"};
        for ( String members : queueMembers) {
            boolean result = queue.add(members);
            if (result = true) {
                System.out.println("Successfully added: " + members);
            } else {
                System.out.println("There was a problem adding " + members);
            }
        }
        System.out.println("There are currently: " + queue.size() + " people in queue");

        // print the member at the top but do not remove them
        System.out.println("The next up is: " + queue.peek() + ". They are still waiting...");
        System.out.println("There are currently: " + queue.size() + " people in queue");

        // process the top member of the queue and show the next member
        System.out.println("Now processing: " + queue.poll() + "\n" +
                "The next member is: " + queue.peek() + ".");

        // how many are in queue
        System.out.println("There are currently: " + queue.size() + " people in queue");

        System.out.println("Ending Queue Section");
    }
}
