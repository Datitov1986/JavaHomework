import java.util.Arrays;
public class Homework1_Task3 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int m = 3;
        int n = 3;
        Homework1_Task3 obj = new Homework1_Task3();
        int arr[] = obj.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(arr));
    }


    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        nums1 = new int[]{1, 2, 3, 0, 0, 0};
        nums2 = new int[]{2, 5, 6};
        m = 3;
        n = 3;
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(j>=0){
            if(i<0){
                nums1[k--] = nums2[j--];
            }else{
                if(nums2[j]>=nums1[i]){
                    nums1[k--] = nums2[j--];
                }else{
                    nums1[k--] = nums1[i--];
                }
            }
        }
        return nums1;
    }
}

