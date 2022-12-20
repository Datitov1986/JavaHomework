package Homework3;

import java.util.ArrayList;
import java.util.Iterator;

// На вход приходт ArrayList<Integer> удалите из него четные числа (на итератор)
public class Homework3_Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(3);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(2);
        nums.add(2);
        nums.add(9);
        nums.add(4);
        nums.add(1);
        System.out.println(nums);
        System.out.println(RemoveEvenNumbers(nums));
    }

    public static ArrayList<Integer> RemoveEvenNumbers(ArrayList<Integer> nums) {
        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        return nums;
    }
}

/* Вариант без итератора
    public static ArrayList<Integer> RemoveEvenNumbers(ArrayList<Integer> nums) {
        nums.removeIf(integer -> integer % 2 == 0);
        return nums;
    }

 */
