import java.util.LinkedList;

public class Kolekce4 {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // add
        linkedList.add("Petr");
        linkedList.add("Jan");
        linkedList.add("Vaclav");
        linkedList.add("Martin");
        linkedList.add("Josef");

        // removeFirst
        linkedList.removeFirst();

        // removeLast
        linkedList.removeLast();

        // remove
        linkedList.remove(1);

        // foreach
        System.out.println("Foreach");
        for (String s : linkedList) {
            System.out.println(s);
        }
        System.out.println();
    }
}