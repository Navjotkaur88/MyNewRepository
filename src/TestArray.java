import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestArray {
    public static void main(String[] args){

        List<Integer> list1 =new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        List<Integer> list2 =new LinkedList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);


        list1.add(60);
        long count = Arrays.stream(list1.toArray()).count();
        System.out.println(count);
        Object[] objects = list1.toArray();
       System.out.println(objects[objects.length - 4]);
        System.out.println(list1);
        int i = list1.indexOf(30);
        System.out.println("Index of 30 is : " +i);
       list1.addAll(list2);
       System.out.println();
        int j = list2.indexOf(30);
        System.out.println("Index of 30 is : " +j);
    }
}
