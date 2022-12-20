package Homework3;

import java.util.ArrayList;
// На вход приходят два ArrayList<Integer> напишите метод, который проверяет два массива на равенство.
// Нужно реализовать алгоритм, не использовать метод equals.
public class Homework3_Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(8);
        list1.add(3);
        list1.add(26);
        list1.add(14);

        list2.add(7);
        list2.add(3);
        list2.add(1);
        list2.add(26);
        list2.add(39);
        if (isEquals(list1, list2)) {
            System.out.println("Arrays is equals.");
        } else {
            System.out.println("Arrays is not equals.");
        }
    }

    public static boolean isEquals(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i)) {
                return false;
            }
        }
        return true;
    }
}


