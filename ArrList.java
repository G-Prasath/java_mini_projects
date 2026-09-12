import java.util.*;

public class ArrList {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.get(1));

        list.set(1, 50);

        System.out.println("After Updating : " + list.get(1));

        list.remove(2);

        System.out.println(list.contains(50));

        for(int num: list){
            System.out.println(num);
        }

    }
}