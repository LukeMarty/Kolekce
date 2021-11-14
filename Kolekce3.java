import java.util.HashMap;

public class Kolekce3 {

    public static void main(String[] args) {

        // Integer - klic, String - hodnota
        HashMap<Integer, String> hashMap = new HashMap<>();

        // put
        hashMap.put(1, "Petr");
        hashMap.put(3, "Martin");
        hashMap.put(6, "Jan");
        hashMap.put(8, "Josef");
        hashMap.put(4, "Karel");

        // get
        System.out.println(hashMap.get(6)); // Jan

        // remove
        hashMap.remove(6);

        // size
        System.out.println(hashMap.size());

        // keySet
        System.out.println("keySet");
        for (int i : hashMap.keySet()) {
            System.out.println(i);
        }
        System.out.println();

        // values
        System.out.println("values");
        for (String s : hashMap.values()) {
            System.out.println(s);
        }
    }
}