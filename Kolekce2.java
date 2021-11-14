import java.util.HashSet;

public class Kolekce2 {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        // add
        hashSet.add("Petr");
        hashSet.add("Petr"); // Tento prvek se neprida
        hashSet.add("Jan");
        hashSet.add("Martin");
        hashSet.add("Josef");

        // foreach
        System.out.println("Foreach");
        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}