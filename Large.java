import java.util.*;
public class Large{
    public static int FindLargest(int[]arr){
        int n=arr.length;
        Arrays.sort(arr);
        return arr[n-1];
    }
    public static void main(String[] args) {
        int[]arr={22,0,4,76,2,7,11,8,35};
        int largest_num=FindLargest(arr);
        System.out.println("The largest number is:"+largest_num);
    }
}

