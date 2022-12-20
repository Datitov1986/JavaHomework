package Homework3;


import java.util.ArrayList;

// На вход методу приходят два ArrayList<Integer> и целое число num.
// Проверьте, что число num встречается в обоих массивах одинаковое кол-во раз.

public class Homework3_Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int num = 8;
        list1.add(1);
        list1.add(8);
        list1.add(3);
        list1.add(26);
        list1.add(14);

        list2.add(7);
        list2.add(3);
        list2.add(8);
        list2.add(26);
        list2.add(39);

        if (NumberOfMeetings(list1, list2, num)) {
            System.out.println("Число " + num + " встречается в обоих массивах одинаковое колличество раз.");
        } else {
            System.out.println("Число " + num + " встречается разное колличество раз в массивах.");
        }
    }

    public static boolean NumberOfMeetings(ArrayList<Integer> list1, ArrayList<Integer> list2, int num) {

        int count1 = 0;
        for (Integer integer : list1) {
            if (integer == num) {
                count1++;
            }
        }

        int count2 = 0;
        for (Integer integer : list2) {
            if (integer == num) {
                count2++;
            }
        }
        return count1 == count2;
    }
}