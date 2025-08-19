import java.util.*;
public class maxConsecutiveOnes {
    public static int maximumConsecutiveOnes(int[]arr){
        int count=0;
        int max=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++; //increment the count when encountered 1
                max=Math.max(max,count);
            }else{
                count=0; //let the count be 0
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[]arr={1,1,0,0,0,0,0,1,1,1,1,0,1,1,0};
        System.out.println("The max consecutives one:"+maximumConsecutiveOnes(arr));
    }
}
