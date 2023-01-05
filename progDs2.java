import java.util.LinkedList;

public class progDs2 
{
    public static void enqueue(LinkedList<Integer> linkedList, int num) 
    {
        linkedList.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> linkedList) 
    {
        int num = 0;
        num = linkedList.get(0);
        linkedList.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> linkedList) 
    {
        int num = 0;
        num = linkedList.get(0);
        return num;
    }

    public static void main(String[] args) 
    {

        int[] array = { 7, 2, 5, 9, 3, 1, 6, 8 };

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer i : array) 
        {
            linkedList.add(i);
        }
        System.out.println("Изначальный список: " + linkedList);

        Integer enq = 4;
        enqueue(linkedList, enq);
        System.out.printf("Метод enqueue()\n  Элемент %s помещён в конец очереди: %s\n", enq, linkedList);

        Integer dq = dequeue(linkedList);
        System.out.printf("Метод dequeue()\n  Первый элемент %s удалён из очереди: %s\n", dq, linkedList);

        Integer f = first(linkedList);
        System.out.printf("Метод first()\n  Первым элементом из списка - %s - является: %s\n", linkedList, f);
    }
}
