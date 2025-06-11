import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_ArrayList {

    public static String[] createArrayList() {
    ArrayList<String> list = new ArrayList<>();
    list.add("Hello");
    list.add("World!");
    return list.toArray(new String[0]);
    }

    public static String[] createLinkedList() {
        LinkedList<String> listLinked = new LinkedList<>();
        listLinked.add("HelloLinked!");
        listLinked.add("WorldLinked!");
        return listLinked.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] resultArray = createArrayList();
        for (String s : resultArray) {
            System.out.println(s);
        }
        String[] resultArray2 = createLinkedList();
        for (String s : resultArray2) {
            System.out.println(s);
        }


    }





}
