package homework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ListOptions {
    public static void getListEnqueue(){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Введите переменную: ");
        int x = sc.nextInt();
        ((LinkedList<Integer>) list).addLast(x);
        System.out.println(list);
    }
    public static void getListDequeue(){
        Queue<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        Scanner sc = new Scanner(System.in);
        System.out.println("Вы хотите удалить первую переменную из списка? ");
        String choice = sc.next();
        if (choice.equals("Да")) {
            ((LinkedList<Integer>) list).removeFirst();
            System.out.println(list);
        }
    }
    public static void getFirst(){
        Queue<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(((LinkedList<Integer>)list).getFirst());
    }
}
