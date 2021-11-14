import java.util.ArrayList;

public class Kolekce {

    public static void main(String[] args) {
    	
        // Vytvoreni kolekce
        ArrayList<String> arrayList = new ArrayList<>();

        // add
        arrayList.add("Petr");
        arrayList.add("Jan");
        arrayList.add("Vaclav");
        System.out.println(arrayList);

        // get
        System.out.println(arrayList.get(0));

        // isEmpty
        System.out.println(arrayList.isEmpty());

        // remove
        arrayList.remove(0);

        // size
        System.out.println(arrayList.size());

        // foreach
        System.out.println();
        System.out.println("Foreach");
        for (String s : arrayList) {
            System.out.println(s);
        }

        // clear
        arrayList.clear();
        System.out.println(arrayList);
    }
}