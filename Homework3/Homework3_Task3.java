package Homework3;

import java.util.ArrayList;

public class Homework3_Task3 {
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
        System.out.println(SortingEvenNumbers(nums));
    }

    public static ArrayList<Integer> SortingEvenNumbers(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (nums.get(i) % 2 == 0 && nums.get(j) % 2 == 0 && nums.get(j) > nums.get(i)) {
                    int temp = nums.get(j);
                    nums.set(j, nums.get(i));
                    nums.set(i, temp);
                }
            }
        }
        return nums;
    }
}

