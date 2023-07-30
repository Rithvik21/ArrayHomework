import java.util.*;
public class Arrays
{
    public static void main(String[] args)
    {
        //#1)
        int[] nums = {1,2,3,4,5,6,7,8};
        int number = nums[1];
        nums[1] = nums[3];
        nums[3] = number;
        for(int i = 0; i<nums.length; i++){
            System.out.print(nums[i]);
        }
        System.out.println();
        
        //#2)
        int[] numbers = {1,2,3,4,5};
        int[] nums2 = new int[5];
        for(int i = 0; i<numbers.length; i++){
            nums2[i] = numbers[numbers.length-i-1];
            System.out.print(nums2[i]);
        }
        
        
        
    }
}
