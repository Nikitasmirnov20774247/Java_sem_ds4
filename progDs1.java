import java.util.LinkedList;

public class progDs1 {
    public static void main(String[] args) 
    {

        int[] array = { 8, 6, 1, 3, 9, 5, 2, 7 };
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (Integer i : array) 
        {
            linkedList.add(i);
        }
        System.out.println("Изначальный список: " + linkedList);
        
        int i = 0;
        while (i != linkedList.size() - 1) 
        {
            linkedList.add(linkedList.size()-i, linkedList.getFirst());
            linkedList.removeFirst();
            i++;
        }
        System.out.println("\"Перевернутый\" список: " + linkedList);
    }
}
